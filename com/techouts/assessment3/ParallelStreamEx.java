package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamEx {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.parallelStream().map(i -> i * 3).forEach(System.out::println);
        // Parallel Streams uses multiple threads the order is not guarantee where as Streams is sequential order
        //Streams are slow for large datasets but parallel stream not slow.
    }
}
