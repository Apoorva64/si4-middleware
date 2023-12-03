using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Routing.wcf.library;

public partial class RoutingService
{
    [DataContract]
    public class Instructions
    {
        [DataMember] public double distance { get; set; }
        [DataMember] public double duration { get; set; }
        [DataMember] public List<Step> steps { get; set; }
    }
}