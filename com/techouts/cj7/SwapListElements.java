package com.techouts.cj7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SwapListElements {
    private static final Logger logger = Logger.getLogger(SwapListElements.class.getName());
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        Collections.swap(list,1,3);
        logger.log(Level.INFO,"After swapping : {0}",list);
    }
}
