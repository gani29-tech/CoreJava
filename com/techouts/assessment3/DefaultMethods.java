package com.techouts.assessment3;
interface A{
    default void display(){
        System.out.println("display from a");
    }
}
interface B{
    default void display(){
        System.out.println("display from b");
    }
}
class C implements A,B{
    @Override
    public void display(){
        System.out.println("display from c");
    }
}
public class DefaultMethods {
    public static void main(String[] args) {
        C c = new C();
        c.display();

    }
}
