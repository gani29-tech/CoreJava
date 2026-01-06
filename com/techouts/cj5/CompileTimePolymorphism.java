package com.techouts.cj5;

import java.util.logging.Level;
import java.util.logging.Logger;

class Printer {
    private static final Logger logger = Logger.getLogger(Printer.class.getName());

    void print() {
        logger.info("Printing........");
    }

    void print(int number) {
        logger.log(Level.INFO, "Printing {0}", number);
    }

    void print(String text) {
        logger.log(Level.INFO,  "Printing {0}", text);
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.print("Hello");
        p.print("World");
        p.print(32);
        p.print(34);
    }
}
