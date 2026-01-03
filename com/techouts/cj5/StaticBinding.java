package com.techouts.cj5;
class Addition{
    static void show(){
        System.out.println("Hello");
    }
    private Addition(){
        show();
    }
}
public class StaticBinding {
    public static void main(String[] args) {
        Addition.show();
    }
}
