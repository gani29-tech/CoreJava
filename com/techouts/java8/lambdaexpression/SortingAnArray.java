package com.techouts.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SortingAnArray {
    private static final Logger logger = Logger.getLogger(SortingAnArray.class.getName());

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(44);
        integers.add(35);
        integers.add(46);
        integers.add(37);
        integers.sort(Comparator.comparingInt(a -> -a));
        logger.log(Level.INFO, "{0}", integers);
        List<String> strings = new ArrayList<>();
        strings.add("Ganesh");
        strings.add("Rakesh");
        strings.add("Manoj");
        strings.add("Karthik");
        strings.sort((a, b) -> b.compareTo(a));
        logger.log(Level.INFO, "{0}", strings);
    }
}
