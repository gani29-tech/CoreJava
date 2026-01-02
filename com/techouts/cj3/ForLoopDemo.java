package com.techouts.cj3;

import java.util.Scanner;

public class ForLoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        for(int i = 1; i <= number; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
            if(i == number/2)
                break;
        }
    }
}
