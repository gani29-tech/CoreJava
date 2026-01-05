package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StaticDemo {
    private static final Logger logger = Logger.getLogger(StaticDemo.class.getName());
    static int number;

    static void showNumber() {
        logger.log(Level.INFO, "Number is {0} ", number);
    }

    public static void main(String[] args) {
        showNumber();
        number = 9;
        logger.log(Level.INFO, "Number is {0} ", number);
    }

    // Static Variable : It is sharable inside the class
    // Static Method : We can access without creating object
    // Both are belongs to the class
    static {
        logger.info("In static block");
    }           // First Preference is static block and next main
}
