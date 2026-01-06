package com.techouts.cj4;

import java.util.logging.Logger;

class Parent {
    private static final Logger logger = Logger.getLogger(Parent.class.getName());

    Parent() {
        logger.info("Parent Constructor");
    }
}

class Child extends Parent {
    private static final Logger logger = Logger.getLogger(Child.class.getName());

    Child() {
        super();
        logger.info("Child Constructor");
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        new Child();
    }
}
