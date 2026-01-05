package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Laptop {
    private int id;
    private String brand;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public Laptop(String brand, int id) {
        this.brand = brand;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setId(int id) {
        this.id = id;
    }

}

public class Encapsulation {
    private static final Logger logger = Logger.getLogger(Encapsulation.class.getName());

    public static void main(String[] args) {
        Laptop laptop = new Laptop("HP", 2);
        logger.log(Level.INFO, " {0} ", laptop);
        laptop.setId(1);
        laptop.setBrand("Apple");
        logger.log(Level.INFO, " {0} ", laptop.getBrand());
        logger.log(Level.INFO, "{0} ", laptop.getId());
    }
}
