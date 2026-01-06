package com.techouts.cj4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyConstructor {
    private static final Logger logger = Logger.getLogger(CopyConstructor.class.getName());
    private final int age;

    public CopyConstructor(int name) {
        this.age = name;
    }

    public CopyConstructor(CopyConstructor obj) {
        this.age = obj.age;
    }

    public static void main(String[] args) {
        CopyConstructor obj = new CopyConstructor(22);
        logger.log(Level.INFO, "{0}", obj.age);
        CopyConstructor obj2 = new CopyConstructor(obj);
        logger.log(Level.INFO, "{0}", obj2.age);
    }

}
