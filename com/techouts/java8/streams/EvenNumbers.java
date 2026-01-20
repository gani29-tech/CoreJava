package com.techouts.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(43);
        list.add(55);
        list.add(44);
        list.add(56);
        list.add(66);
        list.stream()
                .filter(i -> i % 2 == 0)
                .forEach(System.out::println);
    }
}
