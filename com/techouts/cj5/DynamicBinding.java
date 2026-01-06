package com.techouts.cj5;

import java.util.logging.Logger;

class Addition1 {
    private static final Logger logger = Logger.getLogger(Addition1.class.getName());

    void show() {
        logger.info("Hello");
    }
}

class Subtraction1 extends Addition1 {
    private static final Logger logger = Logger.getLogger(Subtraction1.class.getName());

    @Override
    void show() {
        logger.info("World");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Addition1 a = new Subtraction1();
        a.show();
    }
}
