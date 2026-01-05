package com.techouts.assessment1;

import java.util.logging.Logger;

class Cat {
    private static final Logger logger = Logger.getLogger(Cat.class.getName());

    void makeSound() {
        logger.info("Meow");
    }
}

class Dog extends Cat {
    private static final Logger logger = Logger.getLogger(Dog.class.getName());

    @Override
    void makeSound() {
        super.makeSound();
        logger.info("Bow!");
    }
}

public class DynamicBinding {
    public static void main(String[] args) {
        Cat cat = new Dog();
        cat.makeSound();

    }
}
