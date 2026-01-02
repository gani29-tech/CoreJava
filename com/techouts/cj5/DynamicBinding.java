package com.techouts.cj5;
class Addition1 {
    void show(){
        System.out.println("Hello");
    }
}
class Subtraction1 extends Addition1{
    @Override
    void show(){
        System.out.println("World");
    }
}
public class DynamicBinding {
    public static void main(String[] args) {
        Addition1 a = new Subtraction1();
        a.show();
    }
}
