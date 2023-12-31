
package com.example.middleware.routing;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "IRoutingService", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IRoutingService {


    /**
     * 
     * @param start
     * @param end
     * @return
     *     returns com.example.middleware.routing.RoutingServiceRoutingResult
     */
    @WebMethod(operationName = "GetRoute", action = "http://tempuri.org/IRoutingService/GetRoute")
    @WebResult(name = "GetRouteResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetRoute", targetNamespace = "http://tempuri.org/", className = "com.example.middleware.routing.GetRoute")
    @ResponseWrapper(localName = "GetRouteResponse", targetNamespace = "http://tempuri.org/", className = "com.example.middleware.routing.GetRouteResponse")
    public RoutingServiceRoutingResult getRoute(
        @WebParam(name = "start", targetNamespace = "http://tempuri.org/")
        String start,
        @WebParam(name = "end", targetNamespace = "http://tempuri.org/")
        String end);

}
