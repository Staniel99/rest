package jsfclient;

import generated.CarsType;
import server.JAXB;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;

@ManagedBean
@ApplicationScoped
public class CarsBean implements Serializable {
    private CarsType cars;
    public int carId;

    public CarsBean() {
        JAXB jaxb = new JAXB("D:\\5BHIF\\Java\\Telemetry\\telemetry.xml");
        cars = jaxb.getTelemetry().getCars();
    }

    public CarsType getCars() {
        return cars;
    }

    public void setCars(CarsType cars) {
        this.cars = cars;
    }

    public String showDetails(int id){
        this.carId = id;
        return "car";
    }
}
