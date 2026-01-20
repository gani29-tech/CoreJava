package com.techouts.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreationTypes {
    private static final Logger logger = Logger.getLogger(CreationTypes.class.getName());

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        List<Integer> evenlist;
        Stream<Integer> stream1 = list.stream();
        evenlist = stream1.map(i -> i + 1).collect(Collectors.toList());
        logger.log(Level.INFO, "{0}", evenlist);

        Stream<Integer> stream5 = evenlist.stream();
        stream5.skip(2).forEach(System.out::print);

        String[] arr = new String[]{"Ganesh", "Nani", "Gani"};
        Stream<String> stream2 = Arrays.stream(arr);
        stream2.filter(a -> a.endsWith("i")).forEach(System.out::print);

        Stream<String> stream3 = Stream.of("Ganesh", "Nani", "Gani");
        long count = stream3.count();
        logger.log(Level.INFO, "{0}", count);

        Stream<Integer> stream4 = Stream.iterate(1, n -> n + 1).limit(10);
        int sum = stream4.reduce(0, Integer::sum);
        logger.log(Level.INFO, "{0}", sum);
    }
}
