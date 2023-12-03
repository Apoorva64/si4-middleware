using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Routing.wcf.library
{
    [ServiceContract]
    public interface IRoutingService
    {
        [OperationContract]
        RoutingService.RoutingResult GetRoute(string start, string end);
    }


}
