package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MaxMin {
    private static final Logger logger = Logger.getLogger(MaxMin.class.getName());

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(32);
        list.add(23);
        list.add(65);
        list.add(13);
        logger.log(Level.INFO,"List of Elements is : {0}", list.toString());
        Optional<Integer> max = list.stream().max(Integer::compare);
        logger.log(Level.INFO, "Maximum element from the list is : {0}", max);
        Optional<Integer> min = list.stream().min(Integer::compare);
        logger.log(Level.INFO, "Minimum element from the list is : {0}", min);
    }
}
