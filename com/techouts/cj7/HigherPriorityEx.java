package com.techouts.cj7;

import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HigherPriorityEx {
    private static final Logger logger = Logger.getLogger(HigherPriorityEx.class.getName());
    public static void main(String[] args) {
        var queue = new PriorityQueue<Integer>((a,b)->(b-a));
        queue.add(43);
        queue.add(22);
        queue.add(33);
        queue.add(1);
        logger.log(Level.INFO, "{0}", queue.size());
        logger.log(Level.INFO, "{0}", queue.isEmpty());
        logger.log(Level.INFO, "{0}", queue.peek());
        logger.log(Level.INFO, "{0}", queue);
        queue.offer(42);
        logger.log(Level.INFO, "{0}", queue);
        logger.log(Level.INFO, "{0}", queue.poll());
        logger.log(Level.INFO, "{0}", queue);
        logger.log(Level.INFO, "{0}", queue.poll());
        logger.log(Level.INFO, "{0}", queue);
    }
}
