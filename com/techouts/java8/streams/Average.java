package com.techouts.java8.streams;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class Average {
    private static final Logger logger = Logger.getLogger(Average.class.getName());

    public static void main(String[] args) {
        double average = Stream.of(10, 20, 30, 40, 50)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        logger.log(Level.INFO, "Average : {0}", average);
    }
}
