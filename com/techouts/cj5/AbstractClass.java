package com.techouts.cj5;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract class Engine {
    private static final Logger logger = Logger.getLogger(Engine.class.getName());
    int a = 90;

    Engine() {
        logger.info("Engine");
    }

    private void change() {
        logger.info("change");
    }

    public void stop() {
        change();
        logger.info("stop");
    }

    final void start() {
        logger.info("start");
    }

    static void check() {
        logger.info("check");
    }

    abstract void run();
}

class Bus extends Engine {
    private static final Logger logger = Logger.getLogger(Bus.class.getName());

    @Override
    void run() {
        logger.info("Bus is running");
    }
}

class Train extends Bus {
    private static final Logger logger = Logger.getLogger(Train.class.getName());

    @Override
    void run() {
        logger.info("Train is running");
    }
}

public class AbstractClass {
    private static final Logger logger = Logger.getLogger(AbstractClass.class.getName());

    public static void main(String[] args) {
        Engine e2 = new Train();
        e2.start();
        e2.run();
        e2.stop();
        Engine.check();
        logger.log(Level.INFO, "{0}", e2.a);
    }
}
