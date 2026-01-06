package com.techouts.cj3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringBuilderEx {
    private static final Logger logger = Logger.getLogger(StringBuilderEx.class.getName());
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Hello World");
        logger.log(Level.INFO,"sb.append(ss) is {0} ",sb.append("ss"));
    }
}
