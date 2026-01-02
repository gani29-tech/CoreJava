package com.techouts.cj3;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        while(number > 9) {
            sum =0;
            while(number > 0) {

                int remainder = number % 10;
                sum = remainder+sum;
                number = number / 10;
            }
            number = sum;
        }
        System.out.println("The sum is " + sum);
    }
}
