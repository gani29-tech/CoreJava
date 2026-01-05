package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

final class Example1 {                    // cannot inherit
    private static final Logger logger = Logger.getLogger(Example1.class.getName());
    static final double PI = 3.14;             // value cannot be changed

    void show() {
        logger.log(Level.INFO, "{0}", PI);
    }


}

class Example2 {
    private static final Logger logger = Logger.getLogger(Example2.class.getName());

    final void show() {                  // cannot be overridden
        logger.log(Level.INFO, "Hello");
    }
}

public class Final {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.show();
        Example2 e2 = new Example2();
        e2.show();
    }
}
