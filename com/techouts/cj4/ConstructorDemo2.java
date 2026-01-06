package com.techouts.cj4;

import java.util.logging.Level;
import java.util.logging.Logger;

class C {
    private static final Logger logger = Logger.getLogger(C.class.getName());
    int x = 10;

    public void show() {
        logger.log(Level.INFO, "x={0}", x);
    }

}

class D extends C {
    private static final Logger logger = Logger.getLogger(D.class.getName());
    int y = 20;

    @Override
    public void show() {
        super.show();
        logger.log(Level.INFO, "y={0}", y);
    }
}

public class ConstructorDemo2 {
    private static final Logger logger = Logger.getLogger(ConstructorDemo2.class.getName());

    public static void main(String[] args) {
        C a = new D();
        logger.log(Level.INFO, "x={0}", a.x);
        a.show();
    }
}
