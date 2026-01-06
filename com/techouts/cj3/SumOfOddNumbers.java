package com.techouts.cj3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SumOfOddNumbers {
    private static final Logger logger = Logger.getLogger(SumOfOddNumbers.class.getName());

    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            logger.log(Level.INFO, "{0}", i);
        }
    }
}
