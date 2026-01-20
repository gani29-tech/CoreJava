package com.techouts.java8.streams;

import java.util.stream.Stream;

public class FirstContainString {
    public static void main(String[] args) {
        Stream.of("cat", "dog", "mat", "morning")
                .filter(a -> a.contains("m"))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
