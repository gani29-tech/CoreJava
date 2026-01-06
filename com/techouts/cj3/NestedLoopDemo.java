package com.techouts.cj3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NestedLoopDemo {
    private static final Logger logger = Logger.getLogger(NestedLoopDemo.class.getName());

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; true; j++) {
                if (i == j) {
                    break;
                }
                logger.log(Level.INFO, " {0} , {1} ", new Object[]{i, j});
            }
        }
    }
}
