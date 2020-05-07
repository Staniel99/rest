package jsfclient;

import generated.CarType;
import server.JAXB;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CarBean implements Serializable {

    private CarType car;

    @ManagedProperty(value = "#{carsBean}")
    private CarsBean carsBean;

    @PostConstruct
    private void init(){
        findCar();
    }

    private void findCar(){
        for(CarType c : carsBean.getCars().getCar()){
            if(c.getIdCar() == carsBean.carId){
                car=c;
            }
        }
    }

    public CarType getCar() {
        return car;
    }

    public void setCar(CarType car) {
        this.car = car;
    }

    public CarsBean getCarsBean() {
        return carsBean;
    }

    public void setCarsBean(CarsBean carsBean) {
        this.carsBean = carsBean;
    }
}
