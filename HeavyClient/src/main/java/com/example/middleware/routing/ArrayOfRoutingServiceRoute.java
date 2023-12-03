
package com.example.middleware.routing;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ArrayOfRoutingService.Route complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfRoutingService.Route"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RoutingService.Route" type="{http://schemas.datacontract.org/2004/07/Routing.wcf.library}RoutingService.Route" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfRoutingService.Route", propOrder = {
    "routingServiceRoute"
})
public class ArrayOfRoutingServiceRoute {

    @XmlElement(name = "RoutingService.Route", nillable = true)
    protected List<RoutingServiceRoute> routingServiceRoute;

    /**
     * Gets the value of the routingServiceRoute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the routingServiceRoute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingServiceRoute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingServiceRoute }
     * 
     * 
     */
    public List<RoutingServiceRoute> getRoutingServiceRoute() {
        if (routingServiceRoute == null) {
            routingServiceRoute = new ArrayList<RoutingServiceRoute>();
        }
        return this.routingServiceRoute;
    }

}
