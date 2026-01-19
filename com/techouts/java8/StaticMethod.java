package com.techouts.java8;

interface C {
    void show();

    static void show2() {
        System.out.println("default show");
    }
}

class D implements C {
    @Override
    public void show() {
        System.out.println("show");
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        C a = new D();
        a.show();
        C.show2();
    }
}
