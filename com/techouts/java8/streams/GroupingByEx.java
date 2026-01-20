package com.techouts.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("abap");
        list.add("anish");
        list.add("babu");
        list.add("Cat");
        list.add("car");
        Map<Character, List<String>> result = list.stream().collect(Collectors.groupingBy(a -> a.charAt(0)));
        for (char c : result.keySet()) {
            System.out.println(c + " : " + result.get(c));
        }
    }
}
