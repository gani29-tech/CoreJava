package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListOfSquares {
    private static final Logger logger = Logger.getLogger(ListOfSquares.class.getName());

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        logger.log(Level.INFO, "Squares of Elements is given below : {0}", list.toString());
        list.stream().map(a -> a * a).forEach(i -> logger.log(Level.INFO, "{0} ", i));
    }
}
