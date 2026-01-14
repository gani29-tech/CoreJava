package com.techouts.cj7;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HashTableEx {
    private static final Logger logger = Logger.getLogger(HashTableEx.class.getName());

    public static void main(String[] args) {
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(6, "Gani");
        map.put(4, "Jonny");
        map.put(3, "Ganesh");
        map.put(2, "Manoj");
        map.put(1, "Karthik");
        map.put(7, "Rakesh");
        logger.log(Level.INFO, "{0}", map);
        map.remove(4, "Jonny");
        logger.log(Level.INFO, "{0}", map.values());
    }
}
