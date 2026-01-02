package com.techouts.cj1;

public class VariablesDemo {
    static int staticNumber = 20;   //static varible
    int number2 = 30;  //instance variable
    public static void main(String[] args) {
        var number = 10;    //local variable
        System.out.println(number);
        System.out.println(staticNumber);
        VariablesDemo variable = new VariablesDemo();
        System.out.println(variable.number2);

    }
}
