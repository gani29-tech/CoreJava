package com.techouts.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Thread.sleep;

class PerformTask implements Runnable{
    private static final Logger logger = Logger.getLogger(PerformTask.class.getName());
    String msg;
    public PerformTask(String msg){
        this.msg=msg;
    }
    @Override
    public void run() {
        logger.log(Level.INFO,"{0} performing {1}",new Object[]{Thread.currentThread().getName(),msg});
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {

        Runnable r1 = new PerformTask("performTask1");
        Runnable r2 = new PerformTask("performTask2");
        Runnable r3 = new PerformTask("performTask3");
        Runnable r4 = new PerformTask("performTask4");

        try(ExecutorService threadpool = Executors.newFixedThreadPool(3)){
            threadpool.execute(r1);
            threadpool.execute(r2);
            threadpool.execute(r3);
            threadpool.execute(r4);
            threadpool.shutdown();
        }
    }
}
