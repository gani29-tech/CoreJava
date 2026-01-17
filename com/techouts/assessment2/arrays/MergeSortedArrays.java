package com.techouts.assessment2.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MergeSortedArrays {
    private static final Logger logger = Logger.getLogger(MergeSortedArrays.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.log(Level.INFO, "Enter the size of the array 1");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        logger.log(Level.INFO, "Enter the array elements of the array 1");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }
        logger.log(Level.INFO, "Enter the size of the array 2");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        logger.log(Level.INFO, "Enter the array elements of the array 2");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size1; j++) {
                if (arr1[i] < arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        logger.log(Level.INFO, "Sorted Array 1 is : {0}", Arrays.toString(arr1));
        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr2[i] < arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        logger.log(Level.INFO, "Sorted Array 2 is : {0}", Arrays.toString(arr2));
        int[] mergedArr = new int[size1 + size2];
        for (int i = 0; i < size1; i++) {
            mergedArr[i] = arr1[i];
        }
        for (int i = 0; i < size2; i++) {
            mergedArr[i + size1] = arr2[i];
        }
        logger.log(Level.INFO, "Merged Array is : {0}", Arrays.toString(mergedArr));
        for (int i = 0; i < mergedArr.length; i++) {
            for (int j = 0; j < mergedArr.length; j++) {
                if (mergedArr[i] < mergedArr[j]) {
                    int temp = mergedArr[i];
                    mergedArr[i] = mergedArr[j];
                    mergedArr[j] = temp;
                }
            }
        }
        logger.log(Level.INFO, "Merged Sorted Array is : {0}", Arrays.toString(mergedArr));
    }
}
