//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.06 um 04:41:02 PM CEST 
//


package generated;

import javax.xml.bind.annotation.*;


/**
 * <p>Java-Klasse f�r carType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="carType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idCar" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="typ" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="telemetryDataList" type="{http://www.telemetry.org}telemetryDataListType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carType", propOrder = {
    "idCar",
    "name",
    "typ",
    "telemetryDataList"
})
@XmlRootElement(name="car")
public class CarType {

    protected int idCar;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String typ;
    @XmlElement(required = true)
    protected TelemetryDataListType telemetryDataList;

    /**
     * Ruft den Wert der idCar-Eigenschaft ab.
     * 
     */
    public int getIdCar() {
        return idCar;
    }

    /**
     * Legt den Wert der idCar-Eigenschaft fest.
     * 
     */
    public void setIdCar(int value) {
        this.idCar = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der typ-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Legt den Wert der typ-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Ruft den Wert der telemetryDataList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TelemetryDataListType }
     *     
     */
    public TelemetryDataListType getTelemetryDataList() {
        return telemetryDataList;
    }

    /**
     * Legt den Wert der telemetryDataList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TelemetryDataListType }
     *     
     */
    public void setTelemetryDataList(TelemetryDataListType value) {
        this.telemetryDataList = value;
    }

}
