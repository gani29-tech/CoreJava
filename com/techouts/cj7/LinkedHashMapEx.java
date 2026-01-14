package com.techouts.cj7;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LinkedHashMapEx {
    private static final Logger logger = Logger.getLogger(LinkedHashMapEx.class.getName());

    public static void main(String[] args) {
        var map = new LinkedHashMap<Integer, String>();
        map.put(1, "Gani");
        map.put(2, "Ganes");
        map.put(2, "Ganesh");
        map.put(3, "Jonny");
        logger.log(Level.INFO, "{0}", map);
        logger.log(Level.INFO, "{0}", map.get(2));
        logger.log(Level.INFO, "{0}", map.containsKey(4));
        logger.log(Level.INFO, "{0}", map.containsValue("Gani"));
        map.replace(1, "Ganii");
        logger.log(Level.INFO, "{0}", map);
        map.replace(1, "Ganii", "gani");
        logger.log(Level.INFO, "{0}", map);
        map.remove(1);
        logger.log(Level.INFO, "{0}", map);
        map.put(1, "Gani");
        logger.log(Level.INFO, "IsEmpty: {0}", map.isEmpty());
        logger.log(Level.INFO, "{0}", map.putIfAbsent(7, "Ganesh"));
        logger.log(Level.INFO, "{0}", map.values());
        logger.log(Level.INFO, "Key Set : {0}", map.keySet());
        LinkedHashMap<Integer, String> map2 = (LinkedHashMap<Integer, String>) map.clone();
        logger.log(Level.INFO, "Map 1 : {0}", map);
        logger.log(Level.INFO, "Map 2 : {0}", map2);
        LinkedHashMap<Integer, String> map3 = new LinkedHashMap<>(map);
        logger.log(Level.INFO, "{0}", map3);
        logger.log(Level.INFO, "Entry Set : {0}", map.entrySet());
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            logger.log(Level.INFO, "Key : {0} Value : {1}", new Object[]{entry.getKey(), entry.getValue()});
            logger.log(Level.INFO, "{0}", map.equals(new Object[]{entry.getKey(), entry.getValue()}));
        }
    }
}
