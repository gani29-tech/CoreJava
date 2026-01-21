package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class AverageEx {
    private static final Logger logger = Logger.getLogger(AverageEx.class.getName());

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(54);
        list.add(32);
        list.add(23);
        double average = list.stream().collect(Collectors.averagingDouble(Integer::doubleValue));
        logger.log(Level.INFO, "average is {0}", average);
    }
}
