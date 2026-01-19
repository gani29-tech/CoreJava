package com.techouts.java8.lambdaexpression;

import java.util.logging.Level;
import java.util.logging.Logger;

interface MyInterface2 {
    int add(int a, int b);
}

public class AddingEx {
    private static final Logger LOGGER = Logger.getLogger(AddingEx.class.getName());

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        MyInterface2 myInterface2 = (int x, int y) -> a + b;
        LOGGER.log(Level.INFO, "Addition of {0} and {1} is {2}", new Object[]{a, b, myInterface2.add(a, b)});
    }
}
