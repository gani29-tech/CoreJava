package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;

public class LazyEvaluation {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Filter");
        System.out.println(list.stream()
                .filter(a -> {
                    System.out.println(a);
                    return a > 1;
                })
                .findFirst()
                .orElse(0));
        System.out.println("Map");
        System.out.println(list.stream()
                .map(a -> {
                    System.out.println(a);
                    return a + 3;
                })
                .findFirst()
                .orElse(0));
    }
}
