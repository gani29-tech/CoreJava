package com.techouts.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IteratingList {
    private static final Logger logger = Logger.getLogger(IteratingList.class.getName());

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        list.forEach(list1 -> logger.log(Level.INFO, "{0}", new Object[]{list1}));
    }
}
