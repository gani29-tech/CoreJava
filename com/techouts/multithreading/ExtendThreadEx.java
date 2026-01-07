package com.techouts.multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

class MyThread1 extends Thread{
    private static final Logger logger  = Logger.getLogger(MyThread1.class.getName());
    String name;
   MyThread1(String name){
       this.name=name;
   }
   @Override
   public void run(){
       try {
           logger.log(Level.INFO,Thread.currentThread().getName()+" for "+this.name);
           Thread.sleep(2000);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
   }

}
public class ExtendThreadEx {
    private static final Logger logger = Logger.getLogger(ExtendThreadEx.class.getName());
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Except1");
        MyThread1 t2 = new MyThread1("Except2");
        MyThread1 t3 = new MyThread1("Except3");
        t1.setName("FirstThread");
        t2.setName("SecondThread");
        t3.setName("ThirdThread");

        //Priority of Threads
        t3.setPriority(8);
        t2.setPriority(10);
        logger.log(Level.INFO,t1.getName()+" Priority is "+t1.getPriority());
        logger.log(Level.INFO,t2.getName()+" Priority is "+t2.getPriority());
        logger.log(Level.INFO,t3.getName()+" Priority is "+t3.getPriority());

        t3.start();
        t2.start();
        t1.start();
        try{
            t1.join();
            t2.join();
            t3.join();
        }
        catch(InterruptedException e){
            logger.log(Level.SEVERE,e.getMessage(),e);
        }
        finally {
            logger.info("All threads finished");
        }
    }
}
