
package com.example.middleware.routing;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour RoutingService.Route complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="RoutingService.Route"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DirectionType" type="{http://schemas.datacontract.org/2004/07/Routing.wcf.library}SerializableDirectionType" minOccurs="0"/&gt;
 *         &lt;element name="Instructions" type="{http://schemas.datacontract.org/2004/07/Routing.wcf.library}RoutingService.Instructions" minOccurs="0"/&gt;
 *         &lt;element name="Positions" type="{http://schemas.datacontract.org/2004/07/Routing.wcf.library}ArrayOfRoutingService.SerializablePosition" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutingService.Route", propOrder = {
    "directionType",
    "instructions",
    "positions"
})
public class RoutingServiceRoute {

    @XmlElementRef(name = "DirectionType", namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", type = JAXBElement.class, required = false)
    protected JAXBElement<SerializableDirectionType> directionType;
    @XmlElementRef(name = "Instructions", namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", type = JAXBElement.class, required = false)
    protected JAXBElement<RoutingServiceInstructions> instructions;
    @XmlElementRef(name = "Positions", namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRoutingServiceSerializablePosition> positions;

    /**
     * Obtient la valeur de la propriété directionType.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SerializableDirectionType }{@code >}
     *     
     */
    public JAXBElement<SerializableDirectionType> getDirectionType() {
        return directionType;
    }

    /**
     * Définit la valeur de la propriété directionType.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SerializableDirectionType }{@code >}
     *     
     */
    public void setDirectionType(JAXBElement<SerializableDirectionType> value) {
        this.directionType = value;
    }

    /**
     * Obtient la valeur de la propriété instructions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoutingServiceInstructions }{@code >}
     *     
     */
    public JAXBElement<RoutingServiceInstructions> getInstructions() {
        return instructions;
    }

    /**
     * Définit la valeur de la propriété instructions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoutingServiceInstructions }{@code >}
     *     
     */
    public void setInstructions(JAXBElement<RoutingServiceInstructions> value) {
        this.instructions = value;
    }

    /**
     * Obtient la valeur de la propriété positions.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceSerializablePosition }{@code >}
     *     
     */
    public JAXBElement<ArrayOfRoutingServiceSerializablePosition> getPositions() {
        return positions;
    }

    /**
     * Définit la valeur de la propriété positions.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceSerializablePosition }{@code >}
     *     
     */
    public void setPositions(JAXBElement<ArrayOfRoutingServiceSerializablePosition> value) {
        this.positions = value;
    }

}
