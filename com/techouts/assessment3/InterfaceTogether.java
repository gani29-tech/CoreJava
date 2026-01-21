package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InterfaceTogether {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Predicate<Integer> isEven = i -> i % 2 == 0;
        Function<Integer, Integer> cube = i -> i * i * i;
        Consumer<Integer> consume = i -> System.out.println(i);
        list.stream()
                .filter(isEven)
                .map(cube)
                .forEach(consume);

    }
}
