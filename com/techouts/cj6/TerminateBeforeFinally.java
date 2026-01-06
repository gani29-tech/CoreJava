package com.techouts.cj6;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TerminateBeforeFinally {
    private static final Logger logger = Logger.getLogger(TerminateBeforeFinally.class.getName());

    public static void main(String[] args) {
        try {
            int remainder = 10 / 0;
            logger.log(Level.INFO, "Remainder = {0}", remainder);
        } catch (ArithmeticException ex) {
            //System.exit(0);
            //Runtime.getRuntime().halt(0);
        } finally {
            logger.info("Finally block");
        }
    }
}
