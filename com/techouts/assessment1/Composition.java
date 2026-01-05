package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

class MotorCycle {
    Tyre tyre;

    MotorCycle() {
        this.tyre = new Tyre("H1", "Apollo");
    }

    public Tyre getTyre() {
        return tyre;
    }

}

record Tyre(String name, String brand) {

    public String toString() {
        return "Tyre{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

}

public class Composition {
    private static final Logger logger = Logger.getLogger(Composition.class.getName());

    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle();
        logger.log(Level.INFO, "{0}", motorCycle.getTyre());
    }
}
