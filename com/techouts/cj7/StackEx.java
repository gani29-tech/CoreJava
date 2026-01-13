package com.techouts.cj7;

import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StackEx {
    private static final Logger logger = Logger.getLogger(StackEx.class.getName());
    public static void main(String[] args) {
        var stack = new Stack<String>();
        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        logger.log(Level.INFO, "{0}", stack.empty());
        logger.log(Level.INFO, "{0}", stack.isEmpty());
        String x = stack.pop();
        logger.log(Level.INFO, "Popped element : {0}", x);
        logger.log(Level.INFO, "{0}", stack.peek());
    }
}
