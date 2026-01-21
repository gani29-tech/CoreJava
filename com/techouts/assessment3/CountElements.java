package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CountElements {
    private static final Logger logger = Logger.getLogger(CountElements.class.getName());

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(15);
        list.add(27);
        list.add(11);
        list.add(13);
        long count = list.stream().filter(a -> a % 3 == 0).count();
        logger.log(Level.INFO, "Number of elements Divisible by 3 from the list : {0}", count);
    }
}
