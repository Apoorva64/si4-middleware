using System.Runtime.Serialization;

namespace Routing.wcf.library;

[DataContract]
public class StepAndRouteId : RoutingService.Step
{
    [DataMember] public int RouteId { get; set; }

    public StepAndRouteId(RoutingService.Step step, int routeId)
    {
        distance = step.distance;
        duration = step.duration;
        type = step.type;
        instruction = step.instruction;
        name = step.name;
        way_points = step.way_points;
        RouteId = routeId;
    }
}