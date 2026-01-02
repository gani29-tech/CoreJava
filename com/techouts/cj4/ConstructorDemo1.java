package com.techouts.cj4;
class A{
    public void show() {
        System.out.println("Inside A");
    }
}
class B extends A{
    @Override
    public void show() {

        System.out.println("Inside B");

    }
}
public class ConstructorDemo1 {

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
