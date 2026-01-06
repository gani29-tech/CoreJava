package com.techouts.cj4;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StaticDemo {
    private static final Logger logger = Logger.getLogger(StaticDemo.class.getName());
    static class InnerClass{
        void show(){
            logger.info("Nested static class");
        }
    }
    protected static void method1(){
        logger.info("Inside protected static method");
    }
    static String companyName;
    public static void main(String[] args){
        StaticDemo.InnerClass innerClass = new StaticDemo.InnerClass();
        innerClass.show();
        logger.log(Level.INFO, "{0}", companyName);
        method1();
    }
    static{
        companyName = "Tech-outs";
        logger.info("Inside static block");
    }
}
