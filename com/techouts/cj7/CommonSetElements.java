package com.techouts.cj7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommonSetElements {
    private static final Logger logger = Logger.getLogger(CommonSetElements.class.getName());

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set2.add(30);
        set2.add(40);
        set2.add(50);
        set2.add(60);
        Set<Integer> common = new HashSet<>(set1);
        Set<Integer> union = new HashSet<>(set2);
        common.retainAll(set2);
        union.addAll(set1);
        logger.log(Level.INFO, "Set contains Sublist : {0}", union.containsAll(common));
        logger.log(Level.INFO, "Common Elements are : {0}", common);
        logger.log(Level.INFO, "Union of Sets are : {0}", union);
        Set<Integer> set3 = new TreeSet<>(union);
        logger.log(Level.INFO, "Sorted Elements are : {0}", set3);

    }
}
