package com.techouts.cj4;

import java.util.logging.Logger;

final class Monkey extends Animal {
    private static final Logger logger = Logger.getLogger(Monkey.class.getName());

    @Override
    void show() {
        logger.info("Monkey");
    }
}
