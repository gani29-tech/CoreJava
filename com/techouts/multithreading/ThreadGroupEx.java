package com.techouts.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class Group implements Runnable {
    private static final Logger logger = Logger.getLogger(Group.class.getName());
    @Override
    public void run() {
        logger.log(Level.INFO, "{0}", Thread.currentThread().getName());
    }
}
public class ThreadGroupEx {
    private static final Logger logger = Logger.getLogger(ThreadGroupEx.class.getName());
    public static void main(String[] args) {
        Group g = new Group();
        ThreadGroup tg = new ThreadGroup("GroupParent");
        Thread t1 = new Thread(tg,g,"Thread 1" );
        t1.start();
        Thread t2 = new Thread(tg,g,"Thread 2" );
        t2.start();
        Thread t3 = new Thread(tg,g,"Thread 3" );
        t3.start();
        logger.log(Level.INFO, "Active Count of Threads is {0}", tg.activeCount());
        logger.log(Level.INFO, "Parent of Thread is {0}", tg.getName());

    }

}
