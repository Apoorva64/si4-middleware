using System;
using System.Diagnostics;
using System.Linq;
using System.ServiceModel;
using System.Text;
using GeoJSON.Net.Feature;
using GeoJSON.Net.Geometry;
using Newtonsoft.Json;
using OSM.rest.client;
using Routing.wcf.library.JcdecauxProxyService;
using RabbitMQ.Client;
using System.Device.Location;

namespace Routing.wcf.library
{
    public partial class RoutingService : IRoutingService
    {
        static readonly TimeSpan ReceiveTimeout = TimeSpan.FromSeconds(10);
        readonly WSHttpBinding _wsHttpBinding = new WSHttpBinding();

        private readonly JcdecauxProxyServiceClient _jcDecauxProxyServiceClient;
        private Station[] _stations;
        private readonly OsmRoutingClient _osmRoutingClient;

        private static readonly log4net.ILog Log =
            log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod()?.DeclaringType);

        readonly IConnectionFactory _connectionFactory = new ConnectionFactory
        {
            Uri = new Uri(System.Configuration.ConfigurationManager.AppSettings.Get("rabbitmq_address")),
        };

        RoutingService()
        {
            _wsHttpBinding.MaxReceivedMessageSize = 2147483647;
            _jcDecauxProxyServiceClient = new JcdecauxProxyServiceClient(_wsHttpBinding,
                new EndpointAddress(System.Configuration.ConfigurationManager.AppSettings.Get("jcdecaux_address")));
            _stations = _jcDecauxProxyServiceClient.GetStationsAsync().Result;
            _osmRoutingClient = new OsmRoutingClient();
            _stations = _jcDecauxProxyServiceClient.GetStationsAsync().Result;
        }

        public RoutingResult GetRoute(string start, string end)
        {
            FeatureCollection startLocation = _osmRoutingClient.GetLocation(start);


            FeatureCollection endLocation = _osmRoutingClient.GetLocation(end);
            if (startLocation == null || endLocation == null)
            {
                var error = $"Geo decoding failed: {start} -> {startLocation}, {end} -> {endLocation}";
                return new RoutingResult(error);
            }

            Position startPosition = (Position)(startLocation.Features[0].Geometry as Point)?.Coordinates;
            Position endPosition = (Position)(endLocation.Features[0].Geometry as Point)?.Coordinates;
            Log.Info("startPosition: " + JsonConvert.SerializeObject(startPosition, Formatting.Indented));
            Log.Info("endPosition: " + JsonConvert.SerializeObject(endPosition, Formatting.Indented));
            if (startPosition == null || endPosition == null)
            {
                var error =
                    $"geo decoding failed: {start} -> {startPosition}, {end} -> {endPosition}";
                return new RoutingResult(error);
            }


            _stations = _stations = _jcDecauxProxyServiceClient.GetStationsAsync().Result;
            // get nearest stations that have bikes
            var startStation = _stations.OrderBy(
                s => Distance(ToPosition(s), startPosition)).First(s => s.available_bikes > 0);
            var endStation = _stations.OrderBy(
                s => Distance(ToPosition(s), endPosition)).First(s => s.available_bike_stands > 0);


            FeatureCollection walkingRoute = _osmRoutingClient.GetRoute(startPosition, endPosition,
                DirectionType.Walking);

            if (walkingRoute == null)
            {
                var error = $"Route not found: {startPosition} -> {endPosition}";
                return new RoutingResult(error);
            }

            var resultWalking = new RoutingResult(new[]
            {
                new Route(walkingRoute, DirectionType.Walking)
            });

            if (startStation.number == endStation.number)
            {
                Log.Info("Start and end station are the same -> defaulting walking route");
                return ReturnSendToQueue(resultWalking);
            }


            // get route from start to start station
            FeatureCollection startRoute = _osmRoutingClient.GetRoute(startPosition, ToPosition(startStation),
                DirectionType.Walking);

            if (startRoute == null)
            {
                var error = $"Defaulting to walking route";
                Log.Warn(error);
                return ReturnSendToQueue(resultWalking);
            }

            // get route from end to end station
            FeatureCollection endRoute = _osmRoutingClient.GetRoute(ToPosition(endStation), endPosition,
                DirectionType.Walking);

            if (endRoute == null)
            {
                var error = $"Defaulting to walking route";
                Log.Warn(error);
                return ReturnSendToQueue(resultWalking);
            }

            // get route from start station to end station
            FeatureCollection stationRoute = _osmRoutingClient.GetRoute(ToPosition(startStation),
                ToPosition(endStation), DirectionType.Cycling);

            if (stationRoute == null)
            {
                var error = $"Defaulting to walking route";
                Log.Warn(error);
                return ReturnSendToQueue(resultWalking);
            }

            var resultCycling = new RoutingResult(new[]
            {
                new Route(startRoute, DirectionType.Walking),
                new Route(stationRoute, DirectionType.Cycling),
                new Route(endRoute, DirectionType.Walking)
            });


            var result = resultCycling.Duration < resultWalking.Duration ? resultCycling : resultWalking;

            return ReturnSendToQueue(result);
        }

        private RoutingResult ReturnSendToQueue(RoutingResult result)
        {
            using var connection = _connectionFactory.CreateConnection();
            using var channel = connection.CreateModel(
            );
            channel.QueueDeclare(queue: "routing",
                durable: false,
                exclusive: false,
                autoDelete: false,
                arguments: null);
            // purge queue
            channel.QueuePurge("routing");
            // Create messages for instructions
            var i = 0;
            foreach (Route route in result.Routes)
            {
                foreach (var routeInstruction in route.Instructions.steps)
                {
                    var routeInstructionAndRouteId = new StepAndRouteId(routeInstruction, i);
                    var message = JsonConvert.SerializeObject(routeInstructionAndRouteId);
                    Byte[] body = Encoding.UTF8.GetBytes(message);
                    channel.BasicPublish("",
                        "routing",
                        null,
                        body);
                }

                i++;
            }

            return result;
        }


        private static Position ToPosition(Station station)
        {
            Debug.Assert(station.position.lat != null, "station.position != null");
            Debug.Assert(station.position.lng != null, "station.position.longitude != null");
            return new Position((double)station.position.lat, (double)station.position.lng);
        }

        private static double Distance(Position p1, Position p2)
        {
            var sCoord = new GeoCoordinate(p1.Latitude, p1.Longitude);
            var eCoord = new GeoCoordinate(p2.Latitude, p2.Longitude);
            return sCoord.GetDistanceTo(eCoord);
        }
    }
}