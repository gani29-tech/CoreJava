package com.techouts.java8.methodreference;

interface Refer1 {
    void show();
}

class Reference1 {
    public Reference1() {
        System.out.println("Reference1");
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Refer1 refer1 = Reference1::new;
        refer1.show();
    }
}
