using System.Collections.Generic;
using System.Runtime.Serialization;

namespace Routing.wcf.library;

public partial class RoutingService
{
    [DataContract]
    public class Step
    {
        [DataMember] public double distance { get; set; }
        [DataMember] public double duration { get; set; }
        [DataMember] public int type { get; set; }
        [DataMember] public string instruction { get; set; }
        [DataMember] public string name { get; set; }
        [DataMember] public List<int> way_points { get; set; }
    }
}