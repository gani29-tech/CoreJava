package com.techouts.cj3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringBufferEx {
    private static final Logger logger = Logger.getLogger(StringBufferEx.class.getName());
    public static void main(String[] args) {
        String name = "Ganesh";
        StringBuffer stringBuffer = new StringBuffer(name);
        logger.log(Level.INFO, "stringBuffer.toString() : {0}" , stringBuffer.toString());
        logger.log(Level.INFO, "stringBuffer.reverse() : {0}" , stringBuffer.reverse());
    }
}
