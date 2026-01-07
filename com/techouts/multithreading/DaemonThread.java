package com.techouts.multithreading;

import java.util.logging.Logger;
class Thread2 extends Thread {
    private static final Logger logger  = Logger.getLogger(Thread2.class.getName());
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            logger.info("Daemon thread");
        }
        else{
            logger.info("Not Daemon thread");
        }
    }
}
public class DaemonThread {
    public static void main(String[] args) {
        Thread2 t1 = new Thread2();
        Thread2 t2 = new Thread2();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
