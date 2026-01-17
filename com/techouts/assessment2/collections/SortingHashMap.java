package com.techouts.assessment2.collections;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

class SortHashMap implements Comparator<Map.Entry<Integer, String>> {

    @Override
    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
        return o1.getValue().compareTo(o2.getValue());
    }
}

public class SortingHashMap {
    private static final Logger logger = Logger.getLogger(SortingHashMap.class.getName());

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(39, "Ganesh");
        map.put(50, "Adithya");
        map.put(23, "Sriram");
        List<Map.Entry<Integer, String>> list = new LinkedList<>(map.entrySet());
        list.sort(new SortHashMap());
        for (Map.Entry<Integer, String> entry : list) {
            logger.log(Level.INFO, "Key: {0} Value :{1}", new Object[]{entry.getKey(), entry.getValue()});
        }
    }
}
