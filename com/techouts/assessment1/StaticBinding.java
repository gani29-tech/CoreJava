package com.techouts.assessment1;

import java.util.logging.Logger;

class Bottle {
    private static final Logger logger = Logger.getLogger(Bottle.class.getName());

    private Bottle() {
    }

    static void fillBottle1() {
        logger.info("Filling bottle1");
    }

    static void fillBottle2() {
        logger.info("Filling bottle2");
    }
}

public class StaticBinding {
    public static void main(String[] args) {
        Bottle.fillBottle1();
        Bottle.fillBottle2();
    }
}
