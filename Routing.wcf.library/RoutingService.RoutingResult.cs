using System;
using System.Runtime.Serialization;

namespace Routing.wcf.library;

public partial class RoutingService
{
    [DataContract]
    public class RoutingResult
    {
        [DataMember] public Route[] Routes;
        [DataMember] public string Error;

        public RoutingResult(Route[] routes)
        {
            Routes = routes;
            Error = "";
        }

        public RoutingResult(string error)
        {
            Routes = Array.Empty<Route>();
            Error = error;
        }
        
        public double Duration
        {
            get
            {
                double duration = 0;
                foreach (var route in Routes)
                {
                    duration += route.Instructions.duration;
                }

                return duration;
            }
        }
    }
}