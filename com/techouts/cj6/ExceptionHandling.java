package com.techouts.cj6;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionHandling {
    private static final Logger logger = Logger.getLogger(ExceptionHandling.class.getName());
    public static void main(String[] args) {
        int numerator=89;
        int denominator=8;

        try (Scanner input = new Scanner(System.in)) {
            int[] array = new int[5];
            logger.log(Level.INFO, "Enter the values of Array : ");
            for (int i = 0; i < 5; i++) {

                array[i] = input.nextInt();
            }
            for (int i = 0; i < 5; i++) {
                logger.log(Level.INFO, "Value of Array {0} is {1}", new Object[]{i, array[i]});
            }
            int division = numerator / denominator;
            logger.log(Level.INFO, "Division of {0} is {1} is {2}", new Object[]{numerator, denominator, division});
            String name = "gani";
            int stringLength = name.length();
            logger.log(Level.INFO, "Length of String {0}", stringLength);
        } catch (ArithmeticException e) {
            logger.log(Level.WARNING, "{0} {1}", new Object[]{e.getStackTrace(), e.getMessage()});
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.log(Level.WARNING, "Array Index Out Of Bounds", e.getMessage());
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
        }
    }
}
