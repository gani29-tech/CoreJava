package com.techouts.java8.methodreference;

interface Refer {
    void show();
}

class Reference {
    public static void display() {
        System.out.println("static show");
    }
}

public class StaticMethodReference {

    public static void main(String[] args) {
        Refer refer = Reference::display;
        refer.show();
    }
}
