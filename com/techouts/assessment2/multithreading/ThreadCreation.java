package com.techouts.assessment2.multithreading;

import java.util.logging.Logger;

class ExtendThread extends Thread {
    private static final Logger logger = Logger.getLogger(ExtendThread.class.getName());

    @Override
    public void run() {
        logger.info("Hi, From extend thread");
    }
}

class ImplementThread implements Runnable {
    private static final Logger logger = Logger.getLogger(ImplementThread.class.getName());

    @Override
    public void run() {
        logger.info("Hi, From implementation thread");
    }
}

public class ThreadCreation {
    public static void main(String[] args) {
        Thread thread1 = new ExtendThread();
        Runnable runnable = new ImplementThread();
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
