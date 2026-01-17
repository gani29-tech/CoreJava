package com.techouts.assessment2.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MissingNumber {
    private static final Logger logger = Logger.getLogger(MissingNumber.class.getName());

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        logger.info("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];
        logger.info("Enter the elements of an array");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int temp;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        logger.log(Level.INFO, "Sorted array is {0}", Arrays.toString(arr));
        int count = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i - 1] != arr[i] - 1) {
                logger.log(Level.INFO, "Missing number is : {0}", arr[i] - 1);
                count++;
                break;
            }
        }
        if (count == 0) {
            logger.log(Level.INFO, "No missing numbers");
        }
    }
}
