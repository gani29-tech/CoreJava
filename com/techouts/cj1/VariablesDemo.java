package com.techouts.cj1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VariablesDemo {
    private static final Logger logger = Logger.getLogger(VariablesDemo.class.getName());
    static int staticNumber = 20;   //static variable
    int number2 = 30;  //instance variable

    public static void main(String[] args) {
        var number = 10;    //local variable
        logger.log(Level.INFO, "Number is: {0} ", number);
        logger.log(Level.INFO, "Static number is: {0} ", staticNumber);
        VariablesDemo variable = new VariablesDemo();
        logger.log(Level.INFO, "Second Number is: {0} ", variable.number2);

    }
}
