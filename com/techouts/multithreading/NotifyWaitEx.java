package com.techouts.multithreading;

import java.util.LinkedList;
import java.util.Queue;
class Buffer{
    int capacity = 5;
    Queue<Integer> buffer = new LinkedList<>();
    public synchronized void produce(int value) throws InterruptedException {
        while(buffer.size()==capacity){
            System.out.println("Buffer is full");
            wait();
        }
        buffer.add(value);
        System.out.println("Produced: " + value);
        notifyAll();
    }
    public synchronized void consume() throws InterruptedException {
        while(buffer.isEmpty()){
            wait();
        }
        int item = buffer.remove();
        System.out.println("Consumed: " + item);
        notifyAll();
    }
}
class Producer implements Runnable{
    Buffer buffer;
    Producer(Buffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                buffer.produce(i);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer implements Runnable{
    Buffer buffer;
    Consumer(Buffer buffer){
        this.buffer = buffer;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                buffer.consume();
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class NotifyWaitEx{
    public static void main(String[] args){
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);
        new Thread(producer,"Producer").start();
        new Thread(consumer,"consumer").start();
    }
}
