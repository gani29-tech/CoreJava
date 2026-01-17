package com.techouts.assessment2.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionPropagationEx {
    private static final Logger logger = Logger.getLogger(ExceptionPropagationEx.class.getName());
    static void method1(){
        int a = 10/0;
    }
    static void method2(){
        method1();
    }
    static void method3(){
        method2();
    }
    public static void main(String[] args) {
        try{
            method3();
        }catch(Exception e){
            logger.log(Level.WARNING,"{0}",e.getMessage());
        }
    }
    //Here the exception occur at method 1.
    //first it check for catch blocks in method1 and goes to method2
    //and in method 2 also it check for catch block and goes to method 3
    //if in method 3 also catch is there then it goes to main()
    //if in main also not there jvm terminate the program or else exception will catch.
}
