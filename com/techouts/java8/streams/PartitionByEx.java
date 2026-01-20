package com.techouts.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class PartitionByEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Map<Boolean, List<Integer>> result = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        for (Map.Entry<Boolean, List<Integer>> m : result.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
}
