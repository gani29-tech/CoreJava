package com.techouts.assessment2.multithreading;

class Example {
    String name = "throw";

    public synchronized void person1() throws InterruptedException {
        while (name.equals("throw")) {
            wait();
        }
        System.out.println("Ball Throw by person2 Catch by person1");
        name = "throw";
        notifyAll();
    }

    public synchronized void person2() throws InterruptedException {
        while (name.equals("catch")) {
            wait();
        }
        System.out.println("Ball Throw by person1 Catch by person2");
        name = "catch";
        notifyAll();
    }
}

class Person1 implements Runnable {
    Example example;

    public Person1(Example example) {
        this.example = example;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                example.person1();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Person2 implements Runnable {
    Example example;

    public Person2(Example example) {
        this.example = example;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                example.person2();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class InterThreadCommunication {
    public static void main(String[] args) {
        Example example = new Example();
        Person1 person1 = new Person1(example);
        Person2 person2 = new Person2(example);
        Thread t1 = new Thread(person1);
        Thread t2 = new Thread(person2);
        t1.start();
        t2.start();
    }
}
