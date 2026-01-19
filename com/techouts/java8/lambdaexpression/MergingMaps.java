package com.techouts.java8.lambdaexpression;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MergingMaps {
    private static final Logger logger  = Logger.getLogger(MergingMaps.class.getName());
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(39,"Ganesh");
        map1.put(40,"Faisal");
        map1.put(41,"Idris");
        Map<Integer,String> map2 = new HashMap<>();
        map2.put(39,"Gani");
        map2.put(41,"Sonu");
        Map<Integer,String> map3 = new HashMap<>();
        map1.forEach((s,t)->{
            if(map2.containsKey(s)){
                String string = t+map2.get(s);
                map3.put(s,string);
            }
            else{
                map3.put(s,t);
            }
        });
        logger.log(Level.INFO,"Merged Map is : {0}", map3);
    }
}