package com.techouts.cj3;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        int reverse =0;
        do{
            int remainder=number%10;
            reverse =(reverse *10)+remainder;
            number=number/10;
        }while(number!=0);
        System.out.println("Reverse of a Given Number is: "+reverse);
    }
}
