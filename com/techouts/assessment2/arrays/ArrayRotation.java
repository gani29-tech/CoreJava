package com.techouts.assessment2.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayRotation {
    private static final Logger logger = Logger.getLogger(ArrayRotation.class.getName());

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        logger.log(Level.INFO, "Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        logger.info("Enter no of rotations");
        int rotations = input.nextInt();
        int[] rotatedArr = new int[size];
        for (int i = 0; i < size; i++) {
            if (i < rotations) {
                rotatedArr[i] = arr[size - rotations + i];
            } else {
                rotatedArr[i] = arr[i - rotations];
            }
        }
        logger.log(Level.INFO, "The rotated array is : {0} ", Arrays.toString(rotatedArr));
    }
}
