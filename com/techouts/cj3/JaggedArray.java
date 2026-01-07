package com.techouts.cj3;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args){
        int[][] array = new int[3][];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter the number of coloumns in row "+i);
            array[i] = new int[sc.nextInt()];
        }
         for(int i = 0; i < array.length; i++){
             System.out.println("Enter the values of row "+i);
             for(int j = 0; j < array[i].length; j++){
                 array[i][j] = sc.nextInt();
             }
         }
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
