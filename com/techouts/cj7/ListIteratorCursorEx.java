package com.techouts.cj7;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListIteratorCursorEx {
    private static final Logger logger = Logger.getLogger(ListIteratorCursorEx.class.getName());

    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Gani");
        list.add("Ganesh");
        list.add("Jonny");
        ListIterator<String> listiterator = list.listIterator();
        logger.log(Level.INFO, "{0}", list);
        while (listiterator.hasNext()) {
            if (listiterator.next().equals("Gani")) {
                listiterator.remove();
            }
        }
        logger.log(Level.INFO, "After remove Gani : {0}", list);
        listiterator.add("Gani");
        logger.log(Level.INFO, "After adding Gani : {0}", list);
        listiterator = list.listIterator();
        while (listiterator.hasNext()) {
            if (listiterator.next().equals("Ganesh")) {
                listiterator.set("ganesh");
            }
        }
        logger.log(Level.INFO, "After replacing : {0}", list);
    }
}
