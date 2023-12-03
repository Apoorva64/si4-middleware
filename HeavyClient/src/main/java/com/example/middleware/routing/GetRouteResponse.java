
package com.example.middleware.routing;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetRouteResult" type="{http://schemas.datacontract.org/2004/07/Routing.wcf.library}RoutingService.RoutingResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getRouteResult"
})
@XmlRootElement(name = "GetRouteResponse", namespace = "http://tempuri.org/")
public class GetRouteResponse {

    @XmlElementRef(name = "GetRouteResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutingServiceRoutingResult> getRouteResult;

    /**
     * Obtient la valeur de la propriété getRouteResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutingServiceRoutingResult }{@code >}
     *     
     */
    public JAXBElement<RoutingServiceRoutingResult> getGetRouteResult() {
        return getRouteResult;
    }

    /**
     * Définit la valeur de la propriété getRouteResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutingServiceRoutingResult }{@code >}
     *     
     */
    public void setGetRouteResult(JAXBElement<RoutingServiceRoutingResult> value) {
        this.getRouteResult = value;
    }

}
