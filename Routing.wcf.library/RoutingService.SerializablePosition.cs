using System.Runtime.Serialization;
using GeoJSON.Net.Geometry;

namespace Routing.wcf.library;

public partial class RoutingService
{
    [DataContract]
    public class SerializablePosition
    {
        [DataMember] public double Latitude;
        [DataMember] public double Longitude;

        public SerializablePosition(double latitude, double longitude)
        {
            Latitude = latitude;
            Longitude = longitude;
        }

        public SerializablePosition(Position position)
        {
            Latitude = position.Latitude;
            Longitude = position.Longitude;
        }
    }
}