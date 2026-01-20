package com.techouts.java8.streams;

import java.util.stream.Stream;

public class SquareOfEven {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7)
                .filter(i -> i % 2 == 0)
                .map(i -> i * i).forEach(System.out::println);
    }
}
