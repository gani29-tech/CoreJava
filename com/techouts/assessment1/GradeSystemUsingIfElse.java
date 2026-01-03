package com.techouts.assessment1;

import java.util.Scanner;

public class GradeSystemUsingIfElse {
    public static void main(String[] args) {
        int marks;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        marks = input.nextInt();
        if (marks > 90) {
            System.out.println("Garde: A");
        }
        else if (marks > 80) {
            System.out.println("Garde: B");
        }
        else if (marks > 70) {
            System.out.println("Garde: C");
        }
        else if (marks > 60) {
            System.out.println("Garde: D");
        }
        else{
            System.out.println("Fail");
        }
    }
}
