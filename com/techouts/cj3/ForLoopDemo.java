package com.techouts.cj3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ForLoopDemo {
    private static final Logger logger = Logger.getLogger(ForLoopDemo.class.getName());

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        logger.info("Enter a number: ");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                continue;
            }
            logger.log(Level.INFO, "{0} ", i);
        }
        for (int j = 1; j <= number; j++) {
            logger.log(Level.INFO, "{0} ", j);
            if (j == number / 2)
                break;
        }
    }
}
