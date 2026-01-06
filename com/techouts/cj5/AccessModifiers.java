package com.techouts.cj5;

import com.techouts.cj4.*;

import java.util.logging.Level;
import java.util.logging.Logger;

class Building {
    private static final Logger logger = Logger.getLogger(Building.class.getName());

    private void bedroom() {
        logger.info("This is Bedroom");
    }

    void key() {
        bedroom();
    }
}

public class AccessModifiers extends StaticDemo {
    private static final Logger logger = Logger.getLogger(AccessModifiers.class.getName());

    public static void main(String[] args) {
        Building building = new Building();
        building.key();
        method1();
        Student student = new Student(39, "Ganesh");
        logger.log(Level.INFO, "{0}", student);
    }
}
