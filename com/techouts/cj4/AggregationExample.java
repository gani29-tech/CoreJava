package com.techouts.cj4;

import java.util.logging.Logger;

class Bike {
    private static final Logger logger = Logger.getLogger(Bike.class.getName());
    Engine engine;

    public Bike(Engine engine) {
        this.engine = engine;
    }

    void startBike() {
        engine.startEngine();
        logger.info("Bike is running");
    }

    void stopBike() {
        engine.stopEngine();
        logger.info("Bike is stopped");
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Bike bike = new Bike(engine);
        bike.startBike();
        bike.stopBike();
    }
}
