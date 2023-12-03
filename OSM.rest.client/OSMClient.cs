using System.Globalization;
using System.Net.Http;
using GeoJSON.Net.Feature;
using GeoJSON.Net.Geometry;
using Newtonsoft.Json;

namespace OSM.rest.client
{
    public class OsmRoutingClient
    {
        private const string ApiKey = "5b3ce3597851110001cf6248ba0ea999ab9e47e39f4ae0415f4840e3";
        private const string BaseUrl = "https://api.openrouteservice.org";
        private const string DirectionsUrl = "/v2/directions/{0}?api_key={1}&start={2},{3}&end={4},{5}";
        private const string GeoDecodeUrl = "/geocode/search?api_key={0}&text={1}";
        static readonly HttpClient Client = new HttpClient();

        log4net.ILog _log =
            log4net.LogManager.GetLogger(System.Reflection.MethodBase.GetCurrentMethod()?.DeclaringType);

        public FeatureCollection? GetRoute(Position start, Position end, DirectionType directionType)
        {
            _log.Info("GetRoute: " + JsonConvert.SerializeObject(start, Formatting.Indented) + " -> " +
                      JsonConvert.SerializeObject(end, Formatting.Indented));
            string url = string.Format(BaseUrl + DirectionsUrl, directionType.Uri, ApiKey,
                start.Longitude.ToString(CultureInfo.InvariantCulture),
                start.Latitude.ToString(CultureInfo.InvariantCulture),
                end.Longitude.ToString(CultureInfo.InvariantCulture),
                end.Latitude.ToString(CultureInfo.InvariantCulture));
            string json = Client.GetStringAsync(url).Result;
            try
            {
                var featureCollection = JsonConvert.DeserializeObject<FeatureCollection>(json);
                return featureCollection;
            }
            catch (Exception e)
            {
                _log.Error($"Routing failed: {start} -> {end}", e);
                return null;
            }
        }


        public FeatureCollection? GetLocation(string address)
        {
            if (address.Length == 0)
            {
                _log.Info("GetLocation: empty address");
                _log.Error("Geo decoding failed: empty address");
                return null;
            }
            _log.Info("GetLocation: " + address);
            string url = string.Format(BaseUrl + GeoDecodeUrl, ApiKey, Uri.EscapeDataString(address));
            string json = Client.GetStringAsync(url).Result;
            try
            {
                var featureCollection = JsonConvert.DeserializeObject<FeatureCollection>(json);
                return featureCollection;
            }
            catch (Exception e)
            {
                _log.Error($"Geo decoding failed: {address}", e);
                return null;
            }
        }
    }
}