package com.techouts.cj3;

import java.util.Scanner;

public class Pattern3 {
    public void printPattern(int n) {
        int size = n * 2 - 1;
        for (int i = 1; i <= size; i++) {
            printRow(i, n, size);
            System.out.println();
        }
    }

    public void printRow(int i, int n, int size) {
        for (int j = 1; j <= size; j++) {
            System.out.print(getChar(i, j, n));
        }
    }

    public String getChar(int i, int j, int n) {
        if (i == j) {
            return String.valueOf(i > n ? n - (i - n) : i);
        } else if (i + j == n * 2) {
            return String.valueOf(i > n ? j : i);
        } else {
            return " ";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var n = sc.nextInt();
        Pattern3 p = new Pattern3();
        p.printPattern(n);
        sc.close();
    }
}
