package com.techouts.cj3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoWhileDemo {
    private static final Logger logger = Logger.getLogger(DoWhileDemo.class.getName());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        logger.info("Enter a number: ");
        int number = sc.nextInt();
        int reverse = 0;
        do {
            int remainder = number % 10;
            reverse = (reverse * 10) + remainder;
            number = number / 10;
        } while (number != 0);
        logger.log(Level.INFO, "The reversed number is: {0}", reverse);
    }
}
