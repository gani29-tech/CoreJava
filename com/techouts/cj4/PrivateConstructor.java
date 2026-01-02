package com.techouts.cj4;

public class PrivateConstructor {
    private PrivateConstructor() {
        System.out.println("Private Constructor");
    }
    public static PrivateConstructor instance() {
        return new PrivateConstructor();
    }
    public static void main(String[] args) {
        PrivateConstructor obj  = PrivateConstructor.instance();
    }
}
