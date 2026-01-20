package com.techouts.java8.streams;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class UniqueSortedElements {
    private static final Logger logger = Logger.getLogger(UniqueSortedElements.class.getName());

    public static void main(String[] args) {
        Stream.of(4, 3, 6, 5, 3, 4, 5, 6, 3, 9, 7, 5, 3)
                .sorted()
                .distinct()
                .forEach(i -> logger.info(String.valueOf(i)));
    }
}
