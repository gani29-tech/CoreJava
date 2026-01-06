package com.techouts.cj4;

import java.util.logging.Logger;

class Pulsar{
    private static final Logger logger = Logger.getLogger(Pulsar.class.getName());
    Engine engine=new Engine();
    public void startBike(){
        engine.startEngine();
        logger.info("Pulsar Bike Started");
    }
    public void stopBike(){
        engine.stopEngine();
        logger.info("Pulsar Bike Stopped");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Pulsar pulsar=new Pulsar();
        pulsar.startBike();
        pulsar.stopBike();

    }
}
