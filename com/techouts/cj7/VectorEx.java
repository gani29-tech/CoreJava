package com.techouts.cj7;

import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VectorEx {
    private static final Logger logger = Logger.getLogger(VectorEx.class.getName());

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        String a[] = new String[3];
        vector.add("First");
        vector.add("Second");
        vector.add("Third");
        logger.log(Level.INFO, "{0}", vector);
        vector.remove(2);
        logger.log(Level.INFO, "{0}", vector);
        logger.log(Level.INFO, "{0}", vector.capacity());
        vector.copyInto(a);
        logger.log(Level.INFO, "{0}", Arrays.toString(a));
        logger.log(Level.INFO, "{0}", vector.elementAt(0));
    }
}
