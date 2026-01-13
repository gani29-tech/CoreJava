package com.techouts.cj7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListEx {
    private static final Logger logger = Logger.getLogger(ArrayListEx.class.getName());

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        strings.addFirst("Gani");
        Collections.shuffle(strings);
        logger.log(Level.INFO, "{0}", numbers.getFirst());
        var num = new ArrayList<>();
        for (int i = 6; i < 10; i++) {
            num.add(i);
        }
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(numbers.get(i));
        }
        logger.log(Level.INFO, "{0}", (numbers.contains(4)));
        //return all values present in collection
        logger.log(Level.INFO, "{0}", (numbers.containsAll(num)));
        numbers.removeAll(num);
        logger.log(Level.INFO, "{0}", (numbers.containsAll(num)));
        numbers.removeAll(num);
        numbers.addFirst(20);
        numbers.addLast(21);
        //numbers.clear();
        numbers.add(1);
        //Index 1 value replaced by 45 value
        numbers.set(1, 45);
        logger.log(Level.INFO, "{0}", numbers);
    }
}
