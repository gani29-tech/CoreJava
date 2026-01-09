package com.techouts.cj6;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowNew {
    private static final Logger logger = Logger.getLogger(ThrowNew.class.getName());
    public static void main(String[] args) {
        int age;
        try (Scanner input = new Scanner(System.in)) {
            logger.info("Enter age: ");
            age = input.nextInt();
            if (age < 18) {
                throw new ArithmeticException("Age must be greater than 18");
            }
        } catch (ArithmeticException e) {
            logger.log(Level.WARNING, Arrays.toString(e.getStackTrace()));
            logger.log(Level.WARNING, e.toString());

        }

    }
}
