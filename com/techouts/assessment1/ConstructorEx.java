package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Bike {
    String name;
    String brand;
    private static final Logger logger = Logger.getLogger(Bike.class.getName());

    Bike(String name, String brand) {
        this.name = name;
        this.brand = brand;
        logger.info("Hi,I am from Parameterized Constructor");
        logger.log(Level.INFO, "Bike Name:{0}, Brand:{1}", new Object[]{name, brand});

    }

    Bike() {
        this.name = "Default";
        this.brand = "Default";
        logger.info("Hi,I am from DefaultConstructor");
    }

}

public class ConstructorEx {
    private static final Logger logger = Logger.getLogger(ConstructorEx.class.getName());

    public static void main(String[] args) {
        Bike bike = new Bike();
        logger.log(Level.INFO, "Default Constructor Created {0} ", bike);
        Bike bike1 = new Bike("NS200", "Pulsar");
        logger.log(Level.INFO, "Parameterized Constructor Created {0} ", bike1);

    }
}
