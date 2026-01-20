package com.techouts.java8.streams;

import java.util.stream.Stream;

public class FilterElements {
    public static void main(String[] args) {
        Stream.of("joe", "Joe", "Gani", "ajo", "nano", "Hajo")
                .filter(a -> (!a.contains("J") && !a.contains("j")))
                .forEach(System.out::println);
    }
}
