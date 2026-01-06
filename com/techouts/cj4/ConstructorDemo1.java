package com.techouts.cj4;

import java.util.logging.Logger;

class A {
    private static final Logger logger = Logger.getLogger(A.class.getName());

    public void show() {
        logger.info("A");
    }
}

class B extends A {
    private static final Logger logger = Logger.getLogger(B.class.getName());

    @Override
    public void show() {
        logger.info("B");

    }
}

public class ConstructorDemo1 {

    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
