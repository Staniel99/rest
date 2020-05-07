//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.06 um 04:41:02 PM CEST 
//


package generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse f�r telemetryType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="telemetryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cars" type="{http://www.telemetry.org}carsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telemetryType", propOrder = {
    "cars"
})
@XmlRootElement(name="telemetry")
public class TelemetryType {

    @XmlElement(required = true)
    protected CarsType cars;

    /**
     * Ruft den Wert der cars-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CarsType }
     *     
     */
    public CarsType getCars() {
        return cars;
    }

    /**
     * Legt den Wert der cars-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CarsType }
     *     
     */
    public void setCars(CarsType value) {
        this.cars = value;
    }

}
