package com.techouts.cj3;

import java.util.logging.Level;
import java.util.logging.Logger;
class Car{
    Car(String name,String brand){
        this.name = name;
        this.brand = brand;
    }
    private String name;
    private String brand;

    public Car() {
        //
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String toString() {
        return "Car{" + "name=" + name + ", brand=" + brand + '}';
    }
}
public class ArrayOfObjects {
    private static final Logger logger = Logger.getLogger(ArrayOfObjects.class.getName());
    public static void main(String[] args) {
        Car[] car =  new Car[2];
        car[0] = new Car("i20","Hyundai");
        car[1] = new Car();
        car[1].setName("slavia");
        car[1].setBrand("Skoda");
        logger.log(Level.INFO,"Car Name : {0} and Car Brand : {1}", new Object[]{car[1].getName(),car[1].getBrand()});
        logger.log(Level.INFO,"{0}",car[0]);
    }
}
