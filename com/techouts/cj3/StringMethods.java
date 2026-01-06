package com.techouts.cj3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringMethods {
    private static final Logger logger =  Logger.getLogger(StringMethods.class.getName());
    public static void main(String[] args){
        String firstName = " Mekala";
        int number = 909;
        String lastName = new String("Ganesh");
        String fullName = firstName.concat(lastName);
        String name = firstName.format("name is %s", fullName);
        logger.log(Level.INFO, name);
        logger.log(Level.INFO, "Name is: {0}" , fullName);
        logger.log(Level.INFO, "firstName.subString(1,3) is{0}",firstName.substring(1,3));
        logger.log(Level.INFO,"firstName.trim() is {0}",firstName.trim());
        logger.log(Level.INFO, "firstName.length() is {0}",firstName.length());
        logger.log(Level.INFO, "firstName.charAt(2) is {0}",firstName.charAt(2));
        logger.log(Level.INFO, "firstName.contains(ka) is {0}",firstName.contains("ka"));
        logger.log(Level.INFO, "firstName.endsWith(ka) is {0}",firstName.endsWith("ka"));
        logger.log(Level.INFO,"firstName.isEmpty() is {0}",firstName.isEmpty());
        logger.log(Level.INFO,"firstName.indexOf(k) is {0}",firstName.indexOf("k"));
        logger.log(Level.INFO,"firstName.lastIndexOf(k) is {0}",firstName.lastIndexOf("a"));
        logger.log(Level.INFO,"firstName.replace(ka,ak) is {0} ",firstName.replace("ka","ak"));
        logger.log(Level.INFO,"firstName.toLowerCase() is {0} ",firstName.toLowerCase());
        logger.log(Level.INFO,"firstName.toUpperCase() is {0} ",firstName.toUpperCase());
        logger.log(Level.INFO,"String.valueOf(number) is {0} ",String.valueOf(number));
        logger.log(Level.INFO,"firstName.split(a) is {0}", firstName.split("a"));
    }
}
