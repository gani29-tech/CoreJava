package com.techouts.cj5;

import java.util.logging.Level;
import java.util.logging.Logger;

class Add {
    private static final Logger logger = Logger.getLogger(Add.class.getName());

    Add() {
        logger.info("Default Addition Constructor");
    }

    Add(int a, int b) {
        logger.log(Level.INFO, "Sum of {0} and {1} is {2} ", new Object[]{a, b, a + b});
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        new Add();
        new Add(10, 20);
    }
}
