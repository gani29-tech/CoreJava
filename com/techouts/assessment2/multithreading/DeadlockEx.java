package com.techouts.assessment2.multithreading;

class RunDeadlock implements Runnable{
    private final Object name =  new Object();
    private final Object value = new Object();
    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("Thread-0")){
            synchronized (value){
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (name){
                    System.out.println(Thread.currentThread().getName()+" is running");
                }
            }
        }
        else{
            synchronized (name){
                try{
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (value){
                    System.out.println(Thread.currentThread().getName()+" is running");
                }
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
