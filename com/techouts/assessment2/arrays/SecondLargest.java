package com.techouts.assessment2.arrays;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SecondLargest {
    private static final Logger logger = Logger.getLogger(SecondLargest.class.getName());

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        logger.log(Level.INFO, "Enter size of an array");
        int size = input.nextInt();
        logger.log(Level.INFO, "Enter number of integers");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        logger.log(Level.INFO, "The maximum number is {0}", max);
        logger.log(Level.INFO, "The second maximum number is {0}", secondMax);
    }

}
