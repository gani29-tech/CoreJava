package com.techouts.assessment2.strings;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringImmutability {
    private static final Logger logger = Logger.getLogger(StringImmutability.class.getName());
    public static void main(String[] args){
        String name = "Ganesh";
        logger.log(Level.INFO,"{0}",name.hashCode());
        name = "gani";
        logger.log(Level.INFO,"Name : {0}",name.hashCode());

    }
}
