package com.techouts.cj7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IteratorCursorEx {
    private static final Logger logger = Logger.getLogger(IteratorCursorEx.class.getName());
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Gani");
        queue.add("Ganesh");
        queue.add("Jonny");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Gani")) {
                iterator.remove();
            }
        }
        iterator = queue.iterator();
        while (iterator.hasNext()) {
            logger.log(Level.INFO, "{0}", iterator.next());
        }
    }
}
