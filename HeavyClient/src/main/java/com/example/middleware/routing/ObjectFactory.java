
package com.example.middleware.routing;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.middleware.routing package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RoutingServiceRoutingResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "RoutingService.RoutingResult");
    private final static QName _ArrayOfRoutingServiceRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "ArrayOfRoutingService.Route");
    private final static QName _RoutingServiceRoute_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "RoutingService.Route");
    private final static QName _SerializableDirectionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "SerializableDirectionType");
    private final static QName _RoutingServiceInstructions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "RoutingService.Instructions");
    private final static QName _ArrayOfRoutingServiceStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "ArrayOfRoutingService.Step");
    private final static QName _RoutingServiceStep_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "RoutingService.Step");
    private final static QName _ArrayOfRoutingServiceSerializablePosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "ArrayOfRoutingService.SerializablePosition");
    private final static QName _RoutingServiceSerializablePosition_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "RoutingService.SerializablePosition");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _GetRouteStart_QNAME = new QName("http://tempuri.org/", "start");
    private final static QName _GetRouteEnd_QNAME = new QName("http://tempuri.org/", "end");
    private final static QName _GetRouteResponseGetRouteResult_QNAME = new QName("http://tempuri.org/", "GetRouteResult");
    private final static QName _RoutingServiceStepInstruction_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "instruction");
    private final static QName _RoutingServiceStepName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "name");
    private final static QName _RoutingServiceStepWayPoints_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "way_points");
    private final static QName _RoutingServiceInstructionsSteps_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "steps");
    private final static QName _SerializableDirectionTypeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "Name");
    private final static QName _RoutingServiceRouteDirectionType_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "DirectionType");
    private final static QName _RoutingServiceRouteInstructions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "Instructions");
    private final static QName _RoutingServiceRoutePositions_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "Positions");
    private final static QName _RoutingServiceRoutingResultError_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "Error");
    private final static QName _RoutingServiceRoutingResultRoutes_QNAME = new QName("http://schemas.datacontract.org/2004/07/Routing.wcf.library", "Routes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.middleware.routing
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetRoute }
     * 
     */
    public GetRoute createGetRoute() {
        return new GetRoute();
    }

    /**
     * Create an instance of {@link GetRouteResponse }
     * 
     */
    public GetRouteResponse createGetRouteResponse() {
        return new GetRouteResponse();
    }

    /**
     * Create an instance of {@link RoutingServiceRoutingResult }
     * 
     */
    public RoutingServiceRoutingResult createRoutingServiceRoutingResult() {
        return new RoutingServiceRoutingResult();
    }

    /**
     * Create an instance of {@link ArrayOfRoutingServiceRoute }
     * 
     */
    public ArrayOfRoutingServiceRoute createArrayOfRoutingServiceRoute() {
        return new ArrayOfRoutingServiceRoute();
    }

    /**
     * Create an instance of {@link RoutingServiceRoute }
     * 
     */
    public RoutingServiceRoute createRoutingServiceRoute() {
        return new RoutingServiceRoute();
    }

    /**
     * Create an instance of {@link SerializableDirectionType }
     * 
     */
    public SerializableDirectionType createSerializableDirectionType() {
        return new SerializableDirectionType();
    }

    /**
     * Create an instance of {@link RoutingServiceInstructions }
     * 
     */
    public RoutingServiceInstructions createRoutingServiceInstructions() {
        return new RoutingServiceInstructions();
    }

    /**
     * Create an instance of {@link ArrayOfRoutingServiceStep }
     * 
     */
    public ArrayOfRoutingServiceStep createArrayOfRoutingServiceStep() {
        return new ArrayOfRoutingServiceStep();
    }

    /**
     * Create an instance of {@link RoutingServiceStep }
     * 
     */
    public RoutingServiceStep createRoutingServiceStep() {
        return new RoutingServiceStep();
    }

    /**
     * Create an instance of {@link ArrayOfRoutingServiceSerializablePosition }
     * 
     */
    public ArrayOfRoutingServiceSerializablePosition createArrayOfRoutingServiceSerializablePosition() {
        return new ArrayOfRoutingServiceSerializablePosition();
    }

    /**
     * Create an instance of {@link RoutingServiceSerializablePosition }
     * 
     */
    public RoutingServiceSerializablePosition createRoutingServiceSerializablePosition() {
        return new RoutingServiceSerializablePosition();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingServiceRoutingResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoutingServiceRoutingResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "RoutingService.RoutingResult")
    public JAXBElement<RoutingServiceRoutingResult> createRoutingServiceRoutingResult(RoutingServiceRoutingResult value) {
        return new JAXBElement<RoutingServiceRoutingResult>(_RoutingServiceRoutingResult_QNAME, RoutingServiceRoutingResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceRoute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceRoute }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "ArrayOfRoutingService.Route")
    public JAXBElement<ArrayOfRoutingServiceRoute> createArrayOfRoutingServiceRoute(ArrayOfRoutingServiceRoute value) {
        return new JAXBElement<ArrayOfRoutingServiceRoute>(_ArrayOfRoutingServiceRoute_QNAME, ArrayOfRoutingServiceRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingServiceRoute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoutingServiceRoute }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "RoutingService.Route")
    public JAXBElement<RoutingServiceRoute> createRoutingServiceRoute(RoutingServiceRoute value) {
        return new JAXBElement<RoutingServiceRoute>(_RoutingServiceRoute_QNAME, RoutingServiceRoute.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerializableDirectionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SerializableDirectionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "SerializableDirectionType")
    public JAXBElement<SerializableDirectionType> createSerializableDirectionType(SerializableDirectionType value) {
        return new JAXBElement<SerializableDirectionType>(_SerializableDirectionType_QNAME, SerializableDirectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingServiceInstructions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoutingServiceInstructions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "RoutingService.Instructions")
    public JAXBElement<RoutingServiceInstructions> createRoutingServiceInstructions(RoutingServiceInstructions value) {
        return new JAXBElement<RoutingServiceInstructions>(_RoutingServiceInstructions_QNAME, RoutingServiceInstructions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "ArrayOfRoutingService.Step")
    public JAXBElement<ArrayOfRoutingServiceStep> createArrayOfRoutingServiceStep(ArrayOfRoutingServiceStep value) {
        return new JAXBElement<ArrayOfRoutingServiceStep>(_ArrayOfRoutingServiceStep_QNAME, ArrayOfRoutingServiceStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingServiceStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoutingServiceStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "RoutingService.Step")
    public JAXBElement<RoutingServiceStep> createRoutingServiceStep(RoutingServiceStep value) {
        return new JAXBElement<RoutingServiceStep>(_RoutingServiceStep_QNAME, RoutingServiceStep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceSerializablePosition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceSerializablePosition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "ArrayOfRoutingService.SerializablePosition")
    public JAXBElement<ArrayOfRoutingServiceSerializablePosition> createArrayOfRoutingServiceSerializablePosition(ArrayOfRoutingServiceSerializablePosition value) {
        return new JAXBElement<ArrayOfRoutingServiceSerializablePosition>(_ArrayOfRoutingServiceSerializablePosition_QNAME, ArrayOfRoutingServiceSerializablePosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingServiceSerializablePosition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoutingServiceSerializablePosition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "RoutingService.SerializablePosition")
    public JAXBElement<RoutingServiceSerializablePosition> createRoutingServiceSerializablePosition(RoutingServiceSerializablePosition value) {
        return new JAXBElement<RoutingServiceSerializablePosition>(_RoutingServiceSerializablePosition_QNAME, RoutingServiceSerializablePosition.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "start", scope = GetRoute.class)
    public JAXBElement<String> createGetRouteStart(String value) {
        return new JAXBElement<String>(_GetRouteStart_QNAME, String.class, GetRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "end", scope = GetRoute.class)
    public JAXBElement<String> createGetRouteEnd(String value) {
        return new JAXBElement<String>(_GetRouteEnd_QNAME, String.class, GetRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingServiceRoutingResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoutingServiceRoutingResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetRouteResult", scope = GetRouteResponse.class)
    public JAXBElement<RoutingServiceRoutingResult> createGetRouteResponseGetRouteResult(RoutingServiceRoutingResult value) {
        return new JAXBElement<RoutingServiceRoutingResult>(_GetRouteResponseGetRouteResult_QNAME, RoutingServiceRoutingResult.class, GetRouteResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "instruction", scope = RoutingServiceStep.class)
    public JAXBElement<String> createRoutingServiceStepInstruction(String value) {
        return new JAXBElement<String>(_RoutingServiceStepInstruction_QNAME, String.class, RoutingServiceStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "name", scope = RoutingServiceStep.class)
    public JAXBElement<String> createRoutingServiceStepName(String value) {
        return new JAXBElement<String>(_RoutingServiceStepName_QNAME, String.class, RoutingServiceStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "way_points", scope = RoutingServiceStep.class)
    public JAXBElement<ArrayOfint> createRoutingServiceStepWayPoints(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_RoutingServiceStepWayPoints_QNAME, ArrayOfint.class, RoutingServiceStep.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceStep }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceStep }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "steps", scope = RoutingServiceInstructions.class)
    public JAXBElement<ArrayOfRoutingServiceStep> createRoutingServiceInstructionsSteps(ArrayOfRoutingServiceStep value) {
        return new JAXBElement<ArrayOfRoutingServiceStep>(_RoutingServiceInstructionsSteps_QNAME, ArrayOfRoutingServiceStep.class, RoutingServiceInstructions.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "Name", scope = SerializableDirectionType.class)
    public JAXBElement<String> createSerializableDirectionTypeName(String value) {
        return new JAXBElement<String>(_SerializableDirectionTypeName_QNAME, String.class, SerializableDirectionType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SerializableDirectionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SerializableDirectionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "DirectionType", scope = RoutingServiceRoute.class)
    public JAXBElement<SerializableDirectionType> createRoutingServiceRouteDirectionType(SerializableDirectionType value) {
        return new JAXBElement<SerializableDirectionType>(_RoutingServiceRouteDirectionType_QNAME, SerializableDirectionType.class, RoutingServiceRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoutingServiceInstructions }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoutingServiceInstructions }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "Instructions", scope = RoutingServiceRoute.class)
    public JAXBElement<RoutingServiceInstructions> createRoutingServiceRouteInstructions(RoutingServiceInstructions value) {
        return new JAXBElement<RoutingServiceInstructions>(_RoutingServiceRouteInstructions_QNAME, RoutingServiceInstructions.class, RoutingServiceRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceSerializablePosition }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceSerializablePosition }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "Positions", scope = RoutingServiceRoute.class)
    public JAXBElement<ArrayOfRoutingServiceSerializablePosition> createRoutingServiceRoutePositions(ArrayOfRoutingServiceSerializablePosition value) {
        return new JAXBElement<ArrayOfRoutingServiceSerializablePosition>(_RoutingServiceRoutePositions_QNAME, ArrayOfRoutingServiceSerializablePosition.class, RoutingServiceRoute.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "Error", scope = RoutingServiceRoutingResult.class)
    public JAXBElement<String> createRoutingServiceRoutingResultError(String value) {
        return new JAXBElement<String>(_RoutingServiceRoutingResultError_QNAME, String.class, RoutingServiceRoutingResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceRoute }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfRoutingServiceRoute }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Routing.wcf.library", name = "Routes", scope = RoutingServiceRoutingResult.class)
    public JAXBElement<ArrayOfRoutingServiceRoute> createRoutingServiceRoutingResultRoutes(ArrayOfRoutingServiceRoute value) {
        return new JAXBElement<ArrayOfRoutingServiceRoute>(_RoutingServiceRoutingResultRoutes_QNAME, ArrayOfRoutingServiceRoute.class, RoutingServiceRoutingResult.class, value);
    }

}
