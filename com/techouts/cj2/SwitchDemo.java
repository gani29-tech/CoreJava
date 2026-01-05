package com.techouts.cj2;

import java.util.Scanner;
import java.util.logging.Logger;

public class SwitchDemo {
    private static final Logger logger = Logger.getLogger(SwitchDemo.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logger.info("Enter Month Number: ");
        int monthNumber = sc.nextInt();
        switch (monthNumber) {
            case 1 -> logger.info("January");
            case 2 -> logger.info("February");
            case 3 -> logger.info("March");
            case 4 -> logger.info("April");
            case 5 -> logger.info("May");
            case 6 -> logger.info("June");
            case 7 -> logger.info("July");
            case 8 -> logger.info("August");
            case 9 -> logger.info("September");
            case 10 -> logger.info("October");
            case 11 -> logger.info("November");
            case 12 -> logger.info("December");
            default -> logger.info("Invalid Month Number");
        }
    }

}
