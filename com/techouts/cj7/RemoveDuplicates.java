package com.techouts.cj7;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoveDuplicates {
    private static final Logger logger = Logger.getLogger(RemoveDuplicates.class.getName());
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        list.add(34);
        list.add(44);
        list.add(34);
        list.add(35);
        list.add(34);
//        for(int i=0;i<list.size();i++){
//            for(int j=i+1;j<list.size();j++){
//                if(list.get(i).equals(list.get(j))){
//                    list.remove(j);
//                }
//            }
//        }
        list.removeIf(integer -> !set.add(integer));
        logger.log(Level.INFO,"After removing duplicates : {0}", list);
    }
}
