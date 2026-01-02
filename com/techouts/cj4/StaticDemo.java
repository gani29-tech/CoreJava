package com.techouts.cj4;
public class StaticDemo {
    static class InnerClass{
        void show(){
            System.out.println("Nested static class");
        }
    }
    protected static void method1(){
        System.out.println("Inside protectd Static method");
    }
    static String companyName;
    public static void main(String[] args){
        StaticDemo.InnerClass innerClass = new StaticDemo.InnerClass();
        innerClass.show();
        System.out.println(companyName);
        method1();
    }
    static{
        companyName = "Tech-outs";
        System.out.println("Inside Static block");
    }
}
