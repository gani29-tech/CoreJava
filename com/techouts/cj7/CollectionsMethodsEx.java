package com.techouts.cj7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CollectionsMethodsEx {
    private static final Logger logger = Logger.getLogger(CollectionsMethodsEx.class.getName());

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        var list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        Collections.shuffle(list);
        logger.log(Level.INFO, "Shuffled: {0}", list);
        logger.log(Level.INFO, " Search: {0}", Collections.binarySearch(list, 3));
        logger.log(Level.INFO, "Maximum : {0}", Collections.max(list));
        logger.log(Level.INFO, "Minimum : {0}", Collections.min(list));
        logger.log(Level.INFO, "{0}", Collections.frequency(list, 3));
        logger.log(Level.INFO, "Maximum : {0}", Collections.disjoint(list, list2));
        Collections.reverse(list);
        logger.log(Level.INFO, "Reversed list : {0}", list);
        Collections.swap(list, 3, 5);
        logger.log(Level.INFO, "Swap : {0}", list);
        Collections.addAll(list,8,9,0);
        logger.log(Level.INFO, "Collection : {0}", list);
        Collections.sort(list);
        logger.log(Level.INFO, "Sorted : {0}", list);
    }
}
