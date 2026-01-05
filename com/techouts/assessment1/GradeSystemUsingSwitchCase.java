package com.techouts.assessment1;

import java.util.Scanner;
import java.util.logging.Logger;

public class GradeSystemUsingSwitchCase {
    private static final Logger logger = Logger.getLogger(GradeSystemUsingSwitchCase.class.getName());
    public static void main(String[] args) {
        int marks;
        Scanner input = new Scanner(System.in);
        logger.info("Enter the marks");
        marks = input.nextInt();
        if (marks % 10==0)
            marks ++;
        switch (marks/10){
            case 9,10 -> logger.info("Grade : A ");
            case 8  -> logger.info("Grade : B ");
            case 7 -> logger.info("Grade : C ");
            case 6 -> logger.info("Grade : D ");
            default -> logger.info("Fail");

        }
    }
}
