using System.Runtime.Serialization;
using OSM.rest.client;

namespace Routing.wcf.library;

[DataContract]
public class SerializableDirectionType
{
    [DataMember] public string Name;

    public SerializableDirectionType(DirectionType directionType)
    {
        Name = directionType.Uri;
    }
}