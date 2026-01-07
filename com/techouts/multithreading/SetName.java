package com.techouts.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadName1 extends Thread {
    private static final Logger logger = Logger.getLogger(ThreadName1.class.getName());
    @Override
    public void run() {
        logger.log(Level.INFO,"Thread  is {0} ", Thread.currentThread().getName());
        logger.log(Level.INFO, "{0} is running...", this.getName());
    }
    ThreadName1(String name) {
        super(name);
    }
    ThreadName1() {}
}
public class SetName {
    private static final Logger logger =  Logger.getLogger(SetName.class.getName());
    public static void main(String[] args) {
        ThreadName1 t1 = new ThreadName1("Thread-X");
        t1.start();
        ThreadName1 t2 = new ThreadName1();
        t2.setName("Thread-Y");
        t2.start();
}
}
