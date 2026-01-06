package com.techouts.cj5;

import java.util.logging.Level;
import java.util.logging.Logger;

interface Drawable {
    Logger logger = Logger.getLogger(Drawable.class.getName());

    void draw();

    static void show() {
        logger.info("show");
    }

    static int getArea(int a, int b) {
        return a * b;
    }

    private void shape() {
        logger.info("shape");
    }

    default void display() {
        shape();
        logger.info("display");
    }
}

class Circle implements Drawable {
    private static final Logger logger = Logger.getLogger(Circle.class.getName());

    @Override
    public void draw() {
        logger.info("drawing circle");
    }
}

class Rectangle implements Drawable {
    private static final Logger logger = Logger.getLogger(Rectangle.class.getName());

    @Override
    public void draw() {
        logger.info("drawing rectangle");
    }
}

public class InterfaceEx {
    private static final Logger logger = Logger.getLogger(InterfaceEx.class.getName());

    public static void main(String[] args) {
        Drawable circle;
        circle = new Circle();
        circle.draw();
        circle = new Rectangle();
        circle.draw();
        Drawable.show();
        circle.display();
        logger.log(Level.INFO, "{0}", Drawable.getArea(1, 2));
    }
}
