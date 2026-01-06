package com.techouts.cj4;

import java.util.logging.Logger;

class ECU {
    private static final Logger logger = Logger.getLogger(ECU.class.getName());

    public void runECU() {
        logger.info("ECU is starting");
    }

    public void stopECU() {
        logger.info("ECU is stopping");
    }
}
