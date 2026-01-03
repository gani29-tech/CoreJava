package com.techouts.assessment1;

public class Loops {
    public static void main(String[] args) {
        // For Loop
        for(int i = 0; i < 40; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        // While Loop
        int number = 56;
        while(true) {
            if(number % 10 == 0) {
                break;
            }
            else
                number++;
        }
        System.out.println(number);

        //Do-while Loop
        do {
            System.out.print(number);
            number++;
        }while(number%9 == 0);
    }
}
