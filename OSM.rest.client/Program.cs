using GeoJSON.Net.Feature;
using GeoJSON.Net.Geometry;

namespace OSM.rest.client
{
    internal static class Program
    {
        public static void Main(string[] args)
        {
            OsmRoutingClient client = new OsmRoutingClient();
            Position start = new Position(8.681495, 49.41461);
            Position end = new Position(8.687872, 49.420318);
            FeatureCollection? route = client.GetRoute(start, end, DirectionType.Walking);
            Console.WriteLine(route?.Features[0].Geometry);

            FeatureCollection? location = client.GetLocation("Heidelberg");
            Console.WriteLine(location?.Features[0].Geometry);
        }
    }
}