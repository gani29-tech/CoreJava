package com.techouts.cj5;

import java.util.logging.Logger;

public class PatternMatching {
    private static final Logger logger = Logger.getLogger(PatternMatching.class.getName());

    public sealed interface Vegetable permits Tomato, Potato {
        void vegetableName();
    }

    static final class Tomato implements Vegetable {
        @Override
        public void vegetableName() {
            logger.info("Tomato");
        }
    }

    static final class Potato implements Vegetable {
        @Override
        public void vegetableName() {
            logger.info("Potato");
        }
    }

    public static void printVegetableName(Vegetable vegetable) {
        switch (vegetable) {
            case Tomato t -> logger.info("Eating Tomato");
            case Potato p -> logger.info("Eating Potato");
        }
    }

    public static void main(String[] args) {
        Tomato t = new Tomato();
        Potato p = new Potato();
        t.vegetableName();
        printVegetableName(t);
        t.vegetableName();
        printVegetableName(p);

    }
}
