package com.techouts.java8.streams;

import java.util.stream.Stream;

public class UppercaseConvert {
    public static void main(String[] args) {
        Stream.of("Gani", "Nani", "Jonny")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
