package com.techouts.cj3;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows , Only odd numbers");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                    System.out.print("1");
                } else if (i == n / 2 && j == n / 2) {
                    System.out.print("3");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
