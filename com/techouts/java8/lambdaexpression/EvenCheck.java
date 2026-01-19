package com.techouts.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvenCheck {
    private static final Logger logger = Logger.getLogger(EvenCheck.class.getName());

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        logger.log(Level.INFO, "List : {0}", list);
        List<Integer> evenList = new ArrayList<>();
        list.forEach(a -> {
                    if (a % 2 == 0)
                        evenList.add(a);
                }
        );
        logger.log(Level.INFO, "Even List : {0}", evenList);
    }
}
