package com.techouts.cj4;

import java.util.logging.Logger;

class Engine{
    private static final Logger logger = Logger.getLogger(Engine.class.getName());
    void startEngine(){
        logger.info("Engine is starting");
    }
    void  stopEngine(){
        logger.info("Engine is stopping");
    }
}
