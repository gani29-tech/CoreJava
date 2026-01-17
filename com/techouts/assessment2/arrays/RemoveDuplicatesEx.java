package com.techouts.assessment2.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RemoveDuplicatesEx {
    private static final Logger logger = Logger.getLogger(RemoveDuplicatesEx.class.getName());

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        logger.info("Enter the size of the array");
        int size = input.nextInt();
        int[] arr = new int[size];
        logger.info("Enter the elements of the array");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        logger.log(Level.INFO, "Elements of the array is {0}", Arrays.toString(arr));
        int[] freq = new int[1026];
        for (int a : arr) {
            freq[a]++;
        }
        int modifiedSize = 0;
        for (int a : freq) {
            if (freq[a] > 0) {
                modifiedSize++;
            }
        }
        int[] modifiedArray = new int[modifiedSize];
        int j = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                modifiedArray[j] = i;
                j++;
            }
        }
        logger.log(Level.INFO, "After removing duplicates from the array : {0}", Arrays.toString(modifiedArray));
    }
}
