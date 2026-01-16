package com.techouts.cj7;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MergingLists {
    private static final Logger logger = Logger.getLogger(MergingLists.class.getName());

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list1.addAll(list2);
        logger.log(Level.INFO, "After Merging : {0}", list1);
        list1.removeIf(integer -> !set.add(integer));
        logger.log(Level.INFO, "After Removing Duplicates : {0}", list1);

    }
}
