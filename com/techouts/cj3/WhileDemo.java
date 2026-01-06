package com.techouts.cj3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WhileDemo {
    private static final Logger logger = Logger.getLogger(WhileDemo.class.getName());
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        logger.info("Enter a number");
        int number = input.nextInt();
        int sum = 0;
        while(number > 9) {
            sum =0;
            while(number > 0) {

                int remainder = number % 10;
                sum = remainder+sum;
                number = number / 10;
            }
            number = sum;
        }
        if(sum == 0)
            sum = number;
        logger.log(Level.INFO, "The sum is: {0}" , sum);
    }
}
