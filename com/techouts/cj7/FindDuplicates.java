package com.techouts.cj7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FindDuplicates {
    private static final Logger logger = Logger.getLogger(FindDuplicates.class.getName());

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        list.add(34);
        list.add(44);
        list.add(34);
        list.add(35);
        list.add(34);
        for (int i = 0; i < list.size(); i++) {
            if(!set.add(list.get(i))){
                logger.log(Level.WARNING, "Duplicate found at index of : {0}",i);
            }
        }

    }
}
