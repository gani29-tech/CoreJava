package com.techouts.assessment1;

import java.util.Scanner;
import java.util.logging.Logger;

public class GradeSystemUsingIfElse {
    private static final Logger logger = Logger.getLogger(GradeSystemUsingIfElse.class.getName());

    public static void main(String[] args) {
        int marks;
        Scanner input = new Scanner(System.in);
        logger.info("Enter the marks");
        marks = input.nextInt();
        if (marks > 90) {
            logger.info("Grade : A");
        } else if (marks > 80) {
            logger.info("Grade : B");
        } else if (marks > 70) {
            logger.info("Grade : C");
        } else if (marks > 60) {
            logger.info("Grade : D");
        } else {
            logger.info("Fail");
        }
    }
}
