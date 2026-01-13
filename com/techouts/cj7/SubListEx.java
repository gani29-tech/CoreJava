package com.techouts.cj7;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SubListEx {
    private static final Logger logger = Logger.getLogger(SubListEx.class.getName());

    public static void main(String[] args) {
        var list = new ArrayList<String>();
        //Adds the elements into collection
        list.add("Gani");
        list.add("Jonny");
        list.add("Johnny");
        list.add("Nani");
        // SubList is creating from list
        var subList = new ArrayList<String>(list.subList(0, 2));
        logger.log(Level.INFO, "{0}", subList);
        list.trimToSize();
        list.ensureCapacity(5);
        logger.log(Level.INFO, "{0}", list);
        //clones the list
        var cloneList = list.clone();
        logger.log(Level.INFO, "{0}", cloneList);
        //checks if the 2 lists have same content
        logger.log(Level.INFO, "{0}", list.equals(cloneList));
        //The elements which is retained are stay in collection ,remaining is removed
        list.retainAll(subList);
        logger.log(Level.INFO, "{0}", list);
    }
}
