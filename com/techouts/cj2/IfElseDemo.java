package com.techouts.cj2;

public class IfElseDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int marks = 75;
        int num = 10;
        int age = 20;
        boolean hasID = true;

        // 1. Basic if
        if(a > 5)
            System.out.println("a is greater than 5");

        // 2. if-else
        if(b > 5)
            System.out.println("b is greater than 5");
        else
            System.out.println("b is 5 or less");

        // 3. if-else
        if(marks >= 90)
            System.out.println("Grade A");
        else if(marks >= 75)
            System.out.println("Grade B");
        else if(marks >= 60)
            System.out.println("Grade C");
        else
            System.out.println("Fail");

        // 4. Nested if-else
        if(num > 0) {
            if(num % 2 == 0)
                System.out.println("Positive even number");
            else
                System.out.println("Positive odd number");
        } else {
            System.out.println("Non-positive number");
        }

        // 5. if with logical operators
        if(age >= 18 && hasID)
            System.out.println("Allowed to enter");
        else
            System.out.println("Not allowed to enter");
    }
}
