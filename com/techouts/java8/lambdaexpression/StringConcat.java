package com.techouts.java8.lambdaexpression;

import java.util.logging.Logger;
@FunctionalInterface
interface MyInterface {
    String doSomething(String message);
}
public class StringConcat {
    private static final Logger  LOGGER = Logger.getLogger(StringConcat.class.getName());
    public static void main(String[] args) {
        MyInterface myInterface = (msg) -> {
            String message = "Hi,";
            return message+msg;
        };
        LOGGER.info(myInterface.doSomething("Hello World!"));
    }
}
