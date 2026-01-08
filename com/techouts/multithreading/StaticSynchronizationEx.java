package com.techouts.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class PrintDemo {
    private static final Logger logger = Logger.getLogger(PrintDemo.class.getName());
    static synchronized void print() {
        logger.log(Level.INFO,"{0} is Started",Thread.currentThread().getName());
        for (int i = 5; i > 0; i--) {
            logger.log(Level.INFO, "{0} Counter -- {1}",new Object[] { Thread.currentThread().getName(), i });
        }
    }
}
class ThreadDemo extends Thread {
    private static final Logger logger = Logger.getLogger(ThreadDemo.class.getName());
    private final String threadName;
    ThreadDemo(String name) {
        threadName=name;
    }
    private Thread thread;
    @Override
    public void run() {
        PrintDemo.print();
        logger.log(Level.INFO, "{0} is Exiting", threadName);
    }

    @Override
    public void start(){
        if(thread == null){
            thread = new Thread(this,threadName);
            thread.start();
        }
    }
}

public class StaticSynchronizationEx {
    public static void main(String[] args) {
        ThreadDemo threadDemo1 = new ThreadDemo("Thread - 1");
        ThreadDemo threadDemo2 = new ThreadDemo("Thread - 2");
        threadDemo1.start();
        threadDemo2.start();
        try{
            threadDemo1.join();
            threadDemo2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
