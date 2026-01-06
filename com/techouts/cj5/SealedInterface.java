package com.techouts.cj5;

import java.util.logging.Logger;

sealed interface Fruit permits Apple, Grape {
    void fruitName();
}

final class Apple implements Fruit {
    private static final Logger logger = Logger.getLogger(Apple.class.getName());

    @Override
    public void fruitName() {
        logger.info("apple");
    }
}

final class Grape implements Fruit {
    private static final Logger logger = Logger.getLogger(Grape.class.getName());

    @Override
    public void fruitName() {
        logger.info("grape");
    }
}

public class SealedInterface {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.fruitName();
        Fruit grape = new Grape();
        grape.fruitName();
    }
}
