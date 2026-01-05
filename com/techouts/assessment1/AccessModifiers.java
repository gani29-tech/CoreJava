package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Accessing {                               // Accessible for same package
    private static final int A = 10;          // Accessible for existed class
    public static final int B = 20;

    public int getA() {
        return A;
    }
}

class Accessed {
    private static final Logger logger = Logger.getLogger(Accessed.class.getName());

    protected void show() {                     // Accessible for same package and subclass of another package
        logger.info("protected");
    }
}

public class AccessModifiers {                  // Accessible for all packages
    private static final Logger logger = Logger.getLogger(AccessModifiers.class.getName());

    public static void main(String[] args) {
        Accessing accessing = new Accessing();
        logger.log(Level.INFO, "{0}", accessing.getA());
        logger.log(Level.INFO, "{0}", Accessing.B);
        Accessed accessed = new Accessed();
        accessed.show();
    }
}