package com.techouts.java8;

interface A {
    void show();

    default void show2() {
        System.out.println("default show");
    }
}

class B implements A {
    @Override
    public void show() {
        System.out.println("show");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        A a = new B();
        a.show();
        a.show2();
    }
}
