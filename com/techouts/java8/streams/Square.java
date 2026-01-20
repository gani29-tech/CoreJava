package com.techouts.java8.streams;

import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 5, 8};
        Arrays.stream(arr).map(a -> a * a)
                .forEach(System.out::println);
    }
}
