package com.techouts.assessment1;

import java.util.logging.Logger;

class Garbage {
    private static final Logger logger = Logger.getLogger(Garbage.class.getName());
    int id;

    Garbage(int id) {
        this.id = id;
        logger.info("Garbage");
    }

    void show() {
        logger.info("Showing Garbage");
    }
}

public class GarbageCollectionDemo {
    static void createObject() {
        Garbage garbage = new Garbage(1);
        garbage.show();                         // Garbage is out of scope after this method
    }

    private static final Logger logger = Logger.getLogger(GarbageCollectionDemo.class.getName());

    public static void main(String[] args) {
        createObject();
        // Here Eligible for Garbage Collection
        logger.info("Eligible for Garbage Collection");
    }
}
