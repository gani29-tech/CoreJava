package com.techouts.java8.streams;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class SumOfElements {
    private static final Logger logger = Logger.getLogger(SumOfElements.class.getName());

    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5).reduce(0, Integer::sum);
        logger.log(Level.INFO, "Sum of elements is : {0}", sum);
    }
}
