package com.techouts.assessment1;

import java.util.logging.Logger;

class Car {
    private static final Logger logger = Logger.getLogger(Car.class.getName());

    void startCar() {
        logger.info("Engine started");
    }
}

class Engine extends Car {
    private static final Logger logger = Logger.getLogger(Engine.class.getName());

    void startEngine() {
        logger.info("Engine is starting");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Engine e = new Engine();
        e.startEngine();
        e.startCar();
    }
}
