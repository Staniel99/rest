//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.06 um 04:41:02 PM CEST 
//


package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _Telemetry_QNAME = new QName("http://www.telemetry.org", "telemetry");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TelemetryType }
     * 
     */
    public TelemetryType createTelemetryType() {
        return new TelemetryType();
    }

    /**
     * Create an instance of {@link TelemetryDataType }
     * 
     */
    public TelemetryDataType createTelemetryDataType() {
        return new TelemetryDataType();
    }

    /**
     * Create an instance of {@link TelemetryDataListType }
     * 
     */
    public TelemetryDataListType createTelemetryDataListType() {
        return new TelemetryDataListType();
    }

    /**
     * Create an instance of {@link CarType }
     * 
     */
    public CarType createCarType() {
        return new CarType();
    }

    /**
     * Create an instance of {@link CarsType }
     * 
     */
    public CarsType createCarsType() {
        return new CarsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelemetryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TelemetryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.telemetry.org", name = "telemetry")
    public JAXBElement<TelemetryType> createTelemetry(TelemetryType value) {
        return new JAXBElement<TelemetryType>(_Telemetry_QNAME, TelemetryType.class, null, value);
    }

}
