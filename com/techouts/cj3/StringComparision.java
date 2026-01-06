package com.techouts.cj3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringComparision {
    private static final Logger logger = Logger.getLogger(StringComparision.class.getName());
    public static void main(String[] args) {
        String string1 = "abc";
        String string2 = "Abc";
        String string3 = new String("abc");
        String string4 = new String("abc");
        logger.log(Level.INFO, "{0}=={1} is {2}", new Object[]{string1, string2, string1 == string2});
        logger.log(Level.INFO, "{0}=={1} is {2}", new Object[]{string3, string4, string3 == string4});
        logger.log(Level.INFO, "{0}=={1} is {2}", new Object[]{string1, string3, string1 == string3});
        logger.log(Level.INFO,"{0}.equalsIgnoreCase{1} is {2}",new Object[]{string1, string2, string1.equalsIgnoreCase(string2)});
        logger.log(Level.INFO,"{0}.equals{1} is {2}",new Object[]{string1, string2, string1.equals(string2)});
        logger.log(Level.INFO,"{0}.equals{1} is {2}",new Object[]{string1, string4, string3.equals(string4)});
        logger.log(Level.INFO,"{0}.equals{1} is {2}",new Object[]{string1, string2, string1.equals(string2)});
        logger.log(Level.INFO,"{0}.compareTo{1} is {2}",new Object[]{string1, string2, string1.compareTo(string2)});
        logger.log(Level.INFO,"{0}.compareTo{1} is {2}",new Object[]{string2, string1, string2.compareTo(string1)});
        logger.log(Level.INFO,"{0}.compareTo{1} is {2}",new Object[]{string1, string3, string1.compareTo(string3)});
        logger.log(Level.INFO,"{0} startsWith(a) {1}",new Object[]{string1, string1.startsWith("a")});
        logger.log(Level.INFO,"{0} startsWith(A) {1}",new Object[]{string1, string1.startsWith("A")});
        logger.log(Level.INFO,"{0} endsWith(a) {1}", new  Object[]{string1, string1.endsWith("a")});
    }
}
