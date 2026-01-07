package com.techouts.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread implements Runnable {
    private static final Logger logger = Logger.getLogger(MyThread.class.getName());

    @Override
    public void run() {
        logger.log(Level.INFO, " Thread {0} is running", Thread.currentThread().getName());
    }
}

public class ImplementThreadEx {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        Thread t1 = new Thread(m1, "Gani");
        Thread t2 = new Thread(m2, "Ganesh");
        t1.start();
        t2.start();
    }
}
