package com.techouts.assessment3;

interface StaticEx {
    static void display() {
        System.out.println("Interface Static Method");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        StaticEx.display();
    }
}
