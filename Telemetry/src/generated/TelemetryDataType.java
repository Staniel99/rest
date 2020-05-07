//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 generiert 
// Siehe <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2020.05.06 um 04:41:02 PM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r telemetryDataType complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="telemetryDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTelemetryData" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="speed" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telemetryDataType", propOrder = {
    "idTelemetryData",
    "latitude",
    "longitude",
    "speed",
    "capacity"
})
@XmlRootElement(name="telemetryData")
public class TelemetryDataType {

    protected int idTelemetryData;
    protected double latitude;
    protected double longitude;
    protected double speed;
    protected double capacity;

    /**
     * Ruft den Wert der idTelemetryData-Eigenschaft ab.
     * 
     */
    public int getIdTelemetryData() {
        return idTelemetryData;
    }

    /**
     * Legt den Wert der idTelemetryData-Eigenschaft fest.
     * 
     */
    public void setIdTelemetryData(int value) {
        this.idTelemetryData = value;
    }

    /**
     * Ruft den Wert der latitude-Eigenschaft ab.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Legt den Wert der latitude-Eigenschaft fest.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Ruft den Wert der longitude-Eigenschaft ab.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Legt den Wert der longitude-Eigenschaft fest.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Ruft den Wert der speed-Eigenschaft ab.
     * 
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Legt den Wert der speed-Eigenschaft fest.
     * 
     */
    public void setSpeed(double value) {
        this.speed = value;
    }

    /**
     * Ruft den Wert der capacity-Eigenschaft ab.
     * 
     */
    public double getCapacity() {
        return capacity;
    }

    /**
     * Legt den Wert der capacity-Eigenschaft fest.
     * 
     */
    public void setCapacity(double value) {
        this.capacity = value;
    }

}
