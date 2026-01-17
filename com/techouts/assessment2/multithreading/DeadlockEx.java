package com.techouts.assessment2.multithreading;

class RunDeadlock implements Runnable{
    private final Object name =  new Object();
    private final Object value = new Object();
    @Override
    public void run() {
        synchronized (name){
            synchronized (value){
                System.out.println(Thread.currentThread().getName()+" is running");
            }
        }
        synchronized (value){
            synchronized (name){
                System.out.println(Thread.currentThread().getName()+" is running");
            }
        }
    }
}
public class DeadlockEx {
    public static void main(String[] args) throws InterruptedException {
        RunDeadlock deadlock = new RunDeadlock();
        Thread t1 = new Thread(deadlock);
        Thread t2 = new Thread(deadlock);
        t1.start();
        t2.start();
    }
}
