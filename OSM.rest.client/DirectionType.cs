using System.Runtime.Serialization;

namespace OSM.rest.client
{
    [DataContract]
    public class DirectionType
    {
        public static readonly DirectionType Cycling = new("cycling-regular");
        public static readonly DirectionType Walking = new("foot-walking");

        public string Uri { get; }

        private DirectionType(string value)
        {
            Uri = value;
        }

        public override string ToString()
        {
            return Uri;
        }
    }
}