package com.techouts.cj7;

import java.util.ArrayDeque;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DequeEx {
    private static final Logger logger = Logger.getLogger(DequeEx.class.getName());

    public static void main(String[] args) {
        var queue = new ArrayDeque<Integer>();
        queue.add(43);
        queue.add(22);
        queue.add(33);
        queue.add(1);
        logger.log(Level.INFO, "{0}", queue);
        logger.log(Level.INFO, "{0}", queue.peekFirst());
        logger.log(Level.INFO, "{0}", queue.peekLast());
        queue.offerFirst(2);
        queue.offerLast(3);
        logger.log(Level.INFO, "{0}", queue);
        logger.log(Level.INFO, "{0}", queue.pollFirst());
        logger.log(Level.INFO, "{0}", queue.pollLast());
        logger.log(Level.INFO, "{0}", queue);
    }
}
