package com.techouts.cj4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrivateConstructor {
    private static final Logger logger = Logger.getLogger(PrivateConstructor.class.getName());

    private PrivateConstructor() {
    }

    public static PrivateConstructor instance() {
        return new PrivateConstructor();
    }

    public static void main(String[] args) {
        PrivateConstructor privateConstructor = PrivateConstructor.instance();
        logger.log(Level.INFO, "{0}", privateConstructor);
    }
}
