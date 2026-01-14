package com.techouts.cj7;

import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TreeMapEx {
    private static final Logger logger = Logger.getLogger(TreeMapEx.class.getName());

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(6, "Gani");
        map.put(4, "Jonny");
        map.put(3, "Ganesh");
        map.put(2, "Manoj");
        map.put(1, "Karthik");
        map.put(7, "Rakesh");
        logger.log(Level.INFO, "Tree Map {0}", map);
        logger.log(Level.INFO, "Tail Map {0}", map.tailMap(3));
        logger.log(Level.INFO, "Head Map {0}", map.headMap(3));
        logger.log(Level.INFO, "Sub Map {0}", map.subMap(3, 9));
        logger.log(Level.INFO, "Ceiling Entry {0}", map.ceilingEntry(5));
        logger.log(Level.INFO, "Floor Entry {0}", map.floorEntry(5));
        logger.log(Level.INFO, "Lower Entry {0}", map.lowerEntry(5));
        logger.log(Level.INFO, "Higher Entry {0}", map.higherEntry(5));
        logger.log(Level.INFO, "EntrySet {0}", map.entrySet());
        logger.log(Level.INFO, "Floor Key {0}", map.floorKey(5));
        logger.log(Level.INFO, "Ceiling Key {0}", map.ceilingKey(5));
        logger.log(Level.INFO, "Higher Key {0}", map.higherKey(5));
        logger.log(Level.INFO, "Lower Key {0}", map.lowerKey(5));
        logger.log(Level.INFO, "Poll First Entry {0}", map.pollFirstEntry());
        logger.log(Level.INFO, "Poll Last Entry {0}", map.pollLastEntry());
        logger.log(Level.INFO, "Descending Map {0}", map.descendingMap());
        logger.log(Level.INFO, "Descending Key Set {0}", map.descendingKeySet());
    }
}
