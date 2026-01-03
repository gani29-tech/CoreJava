package com.techouts.assessment1;

import java.util.Scanner;

public class GradeSystemUsingSwitchCase {
    public static void main(String[] args) {
        int marks;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        marks = input.nextInt();
        int number;
        if (marks % 10==0)
            marks ++;
        switch (marks/10){
            case 9,10 -> System.out.println("Grade: A");
            case 8  -> System.out.println("Grade: B");
            case 7 -> System.out.println("Grade: C");
            case 6 -> System.out.println("Grade: D");
            default -> System.out.println("Fail");

        }
    }
}
