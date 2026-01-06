package com.techouts.cj3;

import java.util.Scanner;
public class ArraysEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array1 = new int[3];
        for(int a = 0; a < array1.length; a++){
            array1[a] = input.nextInt();
        }
        int[] array2 = {1,2,3,4,5};
        for (int k : array1) {
            System.out.print(k + " ");
        }
        System.out.println();
        for (int j : array2) {
            System.out.print(j + " ");
        }
        System.out.println();
        int[][] array3 = {{1,2,3,4},{5,6,7,8}};
        for (int a = 0; a < array3.length; a++){
            for(int b = 0; b < array3[a].length; b++){
                System.out.print(array3[a][b] + " ");
            }
        }
        int[][] array4 = new int[3][2];
        for (int a = 0; a < array4.length; a++){
            for(int b = 0; b < array4[a].length; b++){
                array4[a][b] = input.nextInt();
            }
        }
        for (int a = 0; a < array4.length; a++){
            for(int b = 0; b < array4[a].length; b++){
                System.out.print(array4[a][b] + " ");
            }
            System.out.println();
        }
    }
}
