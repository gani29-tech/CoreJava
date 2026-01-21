package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlattenLists {
    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        list.add(Arrays.asList("Gani", "Mani", "Nani"));
        list.add(Arrays.asList("ganesh", "Manideep", "Nani"));
        list.add(Arrays.asList("Jonny", "Ganesh", "Mani"));
        list.stream().flatMap(Collection::stream).distinct().forEach(System.out::println);
    }
}
