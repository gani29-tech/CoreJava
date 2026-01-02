package com.techouts.cj5;
class Addition{
    static void show(){
        System.out.println("Hello");
    }
}
class Subtraction extends Addition{
    static void show(){
        System.out.println("World");
    }
}
public class StaticBinding {
    public static void main(String[] args) {
        Addition a = new Subtraction();
        Addition.show();
    }
}
