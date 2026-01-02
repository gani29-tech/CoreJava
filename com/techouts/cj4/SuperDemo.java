package com.techouts.cj4;
class Parent{
    public Parent(){
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child Constructor");
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        Child child = new Child();
    }
}
