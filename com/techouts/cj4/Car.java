package com.techouts.cj4;

import java.util.logging.Logger;

class Car {
    private static final Logger logger = Logger.getLogger(Car.class.getName());

    public void useECU(ECU ecu) {
        ecu.runECU();
        logger.info("ECU is started");
        ecu.stopECU();
        logger.info("ECU is stopped");
    }

    public void useEngine(Engine engine) {
        engine.startEngine();
        logger.info("Engine is started");
        engine.stopEngine();
        logger.info("Engine is stopped");
    }

}
