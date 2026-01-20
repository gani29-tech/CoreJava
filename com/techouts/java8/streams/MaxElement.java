package com.techouts.java8.streams;

import java.util.Optional;
import java.util.stream.Stream;

public class MaxElement {
    public static void main(String[] args) {
        Optional<String> max = Stream.of("Gani","Nani","ani").max(String::compareTo);
        max.ifPresent(System.out::println);
    }
}
