package com.techouts.multithreading;

public class StartThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        SampleThread t1 = new SampleThread();
        SampleThread t2 = new SampleThread();
        t1.start();
        t2.start();
        for (int i = 1; i < 4; i++) {
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class SampleThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            Thread.yield();
            System.out.println("hello " +i +" "+ Thread.currentThread().getName());
        }
    }

}
