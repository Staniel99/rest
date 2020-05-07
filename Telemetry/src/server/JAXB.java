package server;

import generated.TelemetryType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXB {
    private TelemetryType telemetry;
    private String path;

    public JAXB(String path) {
        this.path = path;
        this.readXML();
    }

    private void readXML() {
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(TelemetryType.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            telemetry = (TelemetryType) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public TelemetryType getTelemetry() {
        return telemetry;
    }
}
