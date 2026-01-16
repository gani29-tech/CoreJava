package com.techouts.cj7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FrequencyOfListElements {
    private static final Logger logger = Logger.getLogger(FrequencyOfListElements.class.getName());
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);

        logger.log(Level.INFO,"Frequency of 20 : {0}",Collections.frequency(list,20));
    }
}
