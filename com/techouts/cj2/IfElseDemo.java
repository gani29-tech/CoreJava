package com.techouts.cj2;

import java.util.logging.Logger;

public class IfElseDemo {
    private static final Logger logger = Logger.getLogger(IfElseDemo.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int marks = 75;
        int num = 10;
        int age = 20;
        boolean hasID = true;

        // 1. Basic if
        if (a > 5)
            logger.info("A is greater than 5");

        // 2. if-else
        if (b > 5)
            logger.info("B is greater than 5");
        else
            logger.info("b is 5 or less");

        // 3. if-else
        if (marks >= 90)
            logger.info("Grade A");
        else if (marks >= 75)
            logger.info("Grade B");
        else if (marks >= 60)
            logger.info("Grade C");
        else
            logger.info("Fail");

        // 4. Nested if-else
        if (num > 0) {
            if (num % 2 == 0)
                logger.info("Positive even number");
            else
                logger.info("Positive odd number");
        } else {
            logger.info("Non-positive number");
        }

        // 5. if with logical operators
        if (age >= 18 && hasID)
            logger.info("Allowed to enter");
        else
            logger.info("Not allowed to enter");
    }
}
