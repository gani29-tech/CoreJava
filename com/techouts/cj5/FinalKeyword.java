package com.techouts.cj5;

import java.util.logging.Level;
import java.util.logging.Logger;

class Cube {
    private static final Logger logger = Logger.getLogger(Cube.class.getName());

    void show() {
        logger.info("Cube");
    }
}

final class Cuboid extends Cube {
    private static final Logger logger = Logger.getLogger(Cuboid.class.getName());

    @Override
    void show() {
        super.show();
        logger.info("Cuboid");
    }
}

public class FinalKeyword {
    private static final Logger logger = Logger.getLogger(FinalKeyword.class.getName());

    public static void main(String[] args) {
        final int x;
        x = 10;
        logger.log(Level.INFO, "x={0}", x);
        Cuboid c = new Cuboid();
        c.show();
    }
}
