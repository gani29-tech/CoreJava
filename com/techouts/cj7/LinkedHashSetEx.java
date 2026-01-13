package com.techouts.cj7;

import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LinkedHashSetEx {
    private static final Logger logger  = Logger.getLogger(LinkedHashSetEx.class.getName());
    public static void main(String[] args) {
        var set =  new LinkedHashSet<String>();
        set.add("Ganesh");
        set.add("Gani");
        set.add("Jonny");
        logger.log(Level.INFO, "set size: {0}", set);
        set.add("Nani");
        logger.log(Level.INFO, "set size: {0}", set);
        set.remove("Gani");
        logger.log(Level.INFO, "set size: {0}", set);
    }
}
