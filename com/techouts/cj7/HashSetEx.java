package com.techouts.cj7;

import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashSetEx {
    private static final Logger logger = Logger.getLogger(HashSetEx.class.getName());
    public static void main(String[] args){
        var set = new HashSet<String>();
        set.add("Ganesh");
        set.add("Gani");
        set.add("Jonny");
        logger.log(Level.INFO, "{0}", set);
        set.remove("Gani");
        logger.log(Level.INFO, "{0}", set);
        if(set.contains("Jonny")){
            logger.log(Level.INFO, "{0}","Found Jonny");
        }
    }
}
