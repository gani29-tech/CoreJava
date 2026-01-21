package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(33);
        list.add(44);
        list.add(33);
        list.add(55);
        list.add(32);
        list.add(44);
        list.add(55);
        list.stream().distinct().forEach(System.out::println);
    }
}
