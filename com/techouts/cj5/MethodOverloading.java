package com.techouts.cj5;
class Add{
    Add(){
        System.out.println("Default Addition Constructor");
    }
    Add(int a,int b){
        System.out.println("Sum of "+a+","+b+"="+(a+b));
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Add add = new Add();
        Add add2 = new Add(10,20);
    }
}
