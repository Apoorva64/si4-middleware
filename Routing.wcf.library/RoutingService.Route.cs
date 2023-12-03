using System.Linq;
using System.Runtime.Serialization;
using GeoJSON.Net.Feature;
using GeoJSON.Net.Geometry;
using Newtonsoft.Json.Linq;
using OSM.rest.client;

namespace Routing.wcf.library;

public partial class RoutingService
{
    [DataContract]
    public class Route
    {
        [DataMember] public SerializablePosition[] Positions;
        [DataMember] public Instructions Instructions;
        [DataMember] public SerializableDirectionType DirectionType;

        public Route(SerializablePosition[] positions, Instructions instructions, DirectionType directionType)
        {
            Positions = positions;
            Instructions = instructions;
            DirectionType = new SerializableDirectionType(directionType);
        }

        public Route(FeatureCollection featureCollection, DirectionType directionType)
        {
            DirectionType = new SerializableDirectionType(directionType);
            Positions = ((LineString)featureCollection.Features[0].Geometry).Coordinates
                .Select(c => new SerializablePosition(c.Latitude, c.Longitude)).ToArray();
            var segments = featureCollection.Features[0].Properties["segments"];
                
            Instructions = ((JToken)featureCollection.Features[0].Properties["segments"])
                .ToObject<Instructions[]>()[0];
        }
    }
}