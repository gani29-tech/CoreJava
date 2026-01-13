package com.techouts.cj7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LinkedListEx {
    private static final Logger logger = Logger.getLogger(LinkedListEx.class.getName());

    public static void main(String[] args) {
        var list = new LinkedList<String>();
        list.add("Johnny");
        list.add("Jon");
        list.add("Gani");
        list.add("Ganesh");
        list.add("Nani");
        list.add(4,"Nanii");
        Collections.sort(list);
        logger.log(Level.INFO, "{0}", list.getFirst());
        logger.log(Level.INFO, "{0}", list.getLast());
        logger.log(Level.INFO, "{0}", list.peek());
        logger.log(Level.INFO, "{0}", list.get(1));
        logger.log(Level.INFO, "{0}", list);
        list.addFirst("First");
        logger.log(Level.INFO, "{0}", list);
        logger.log(Level.INFO, "{0}", list.get(2));
    }
}

