package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ganesh");
        list.add("Gani");
        list.add("Nani");
        list.add("Nani");
        System.out.println(list.stream().distinct().collect(Collectors.toMap(e -> e, e->e.length())));
    }
}

