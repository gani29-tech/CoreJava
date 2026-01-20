package com.techouts.java8.streams;

import java.util.stream.Stream;

public class CountElements {
    public static void main(String[] args) {
        Stream.of("a", "ab", "gani", "nani", "joe")
                .filter(i -> i.length() > 3)
                .forEach(System.out::println);
    }
}
