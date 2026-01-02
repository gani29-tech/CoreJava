package com.techouts.cj3;

public class SumOfOddNumbers{
    public static void main(String[] args) {
        for(int i=0;i<=20;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
