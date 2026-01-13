package com.techouts.cj7;

import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnumerationCursorEx {
    private static final Logger logger = Logger.getLogger(EnumerationCursorEx.class.getName());

    public static void main(String[] args) {
        var list = new Vector<String>();
        list.add("Gani");
        list.add("Ganesh");
        list.add("Jonny");
        Enumeration<String> enumeration = list.elements();
        while (enumeration.hasMoreElements()) {
            logger.log(Level.INFO, "{0}", enumeration.nextElement());
        }
    }
}
