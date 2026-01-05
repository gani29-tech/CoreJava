package com.techouts.cj1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DatatypesDemo {
    private static final Logger logger = Logger.getLogger(DatatypesDemo.class.getName());

    public static void main(String[] args) {
        int number = 99675410;
        final float PI = 3.14f;
        char gender = 'M';
        double salary = 300000.8676;
        boolean flag = true;
        String name = "Ganesh";
        byte num = (byte) 430;
        long number2 = 4983635746L;
        logger.log(Level.INFO, "Integer : {0}", number);
        logger.log(Level.INFO, "String : {0}", name);
        logger.log(Level.INFO, "Float : {0}", PI);
        logger.log(Level.INFO, "Boolean : {0}", flag);
        logger.log(Level.INFO, "Byte : {0}", num);
        logger.log(Level.INFO, "Long : {0}", number2);
        logger.log(Level.INFO, "Character : {0}", gender);
        logger.log(Level.INFO, "Double : {0}", salary);
    }
}
