package com.techouts.cj7;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NestedMap {
    private static final Logger logger = Logger.getLogger(NestedMap.class.getName());

    public static void main(String[] args) {

        Map<Integer, Map<String, String>> mainMap = new HashMap<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("firstName", "Gani");
        map1.put("lastName", "Yadav");

        Map<String, String> map2 = new HashMap<>();
        map2.put("firstName", "Ganesh");
        map2.put("lastName", "Mekala");

        mainMap.put(1, map1);
        mainMap.put(2, map2);
        logger.log(Level.INFO, "Inner Map Key Set : {0}", mainMap.get(1).keySet());
        logger.log(Level.INFO, "Inner Map values  : {0}", mainMap.get(1).values());
        mainMap.computeIfAbsent(3, k -> new HashMap<>()).put("firstName", "Jonny");
        mainMap.computeIfAbsent(3, k -> new HashMap<>()).put("lastName", "Yadav");
        logger.log(Level.INFO, "Inner Map Key Set : {0}", mainMap.get(2).keySet());
        logger.log(Level.INFO, "Inner Map values  : {0}", mainMap.get(2).values());
        logger.log(Level.INFO, "Inner Map Key Set : {0}", mainMap.get(3).keySet());
        logger.log(Level.INFO, "Inner Map values  : {0}", mainMap.get(3).values());
    }
}
