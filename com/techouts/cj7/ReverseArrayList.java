package com.techouts.cj7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReverseArrayList {
    private static final Logger logger = Logger.getLogger(ReverseArrayList.class.getName());

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(30);
        grades.add(10);
        grades.add(15);
        List<Integer> grades2 = new ArrayList<>();
        ListIterator<Integer> iterator = grades.listIterator(grades.size());
        while (iterator.hasPrevious()) {
            grades2.add(iterator.previous());
        }
        logger.log(Level.INFO, "Original List : {0}" ,grades);
        logger.log(Level.INFO, "Reversed List :{0}", grades2);
    }
}
