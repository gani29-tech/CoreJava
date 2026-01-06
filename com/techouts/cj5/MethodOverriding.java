package com.techouts.cj5;

import java.util.logging.Logger;

class Bike {
    private static final Logger logger = Logger.getLogger(Bike.class.getName());

    void startEngine() {
        logger.info("Bike Engine Started");
    }
}

class Car extends Bike {
    private static final Logger logger = Logger.getLogger(Car.class.getName());

    @Override
    void startEngine() {
        super.startEngine();
        logger.info("Car Engine Started");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
    }
}
