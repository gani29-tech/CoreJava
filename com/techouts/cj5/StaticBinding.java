package com.techouts.cj5;

import java.util.logging.Logger;

class Addition {
    private static final Logger logger = Logger.getLogger(Addition.class.getName());

    static void show() {
        logger.info("Hello");
    }

    private Addition() {
        show();
    }
}

public class StaticBinding {
    public static void main(String[] args) {
        Addition.show();
    }
}
