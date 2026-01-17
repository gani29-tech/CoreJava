package com.techouts.assessment2.strings;

import java.util.logging.Level;
import java.util.logging.Logger;

public class String3Ex {
    private static final Logger logger = Logger.getLogger(String3Ex.class.getName());
    public static void main(String[] args){
        //String is Immutable
        //StringBuffer and StringBuilder are Mutable
        //StringBuffer is synchronized (Thread-safe)
        //StringBuilder is fast because not thread-safe
        String name = "Ganesh";
        logger.log(Level.INFO,"Name before concat or append {0}",name);
        name.concat("gani");
        logger.log(Level.INFO,"Name after concat or append {0}",name);
        name.replace('i','e');
        logger.log(Level.INFO,"Name after replace {0}",name);
        StringBuilder stringBuilder =  new StringBuilder("Hi ");
        logger.log(Level.INFO,"Stringbuilder before concat or append {0}",stringBuilder);
        stringBuilder.append("Ganesh");
        logger.log(Level.INFO,"Stringbuilder after concat or append {0}",stringBuilder);
        stringBuilder.reverse();
        logger.log(Level.INFO,"Stringbuilder after reverse {0}",stringBuilder);
        StringBuffer stringBuffer = new StringBuffer("Hello ");
        logger.log(Level.INFO,"StringBuffer before concat or append {0}",stringBuffer);
        stringBuffer.append("Ganesh");
        logger.log(Level.INFO,"StringBuffer after concat or append {0}",stringBuffer);
    }
}
