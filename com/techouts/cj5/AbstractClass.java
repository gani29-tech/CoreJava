package com.techouts.cj5;
abstract class Engine{
    abstract void run();
}
class Bus extends Engine{
    void run(){
        System.out.println("Bus is running");
    }
}
class Train extends Engine{
    void run(){
        System.out.println("Train is running");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Engine e = new Bus();
        e.run();
        Engine e2 = new Train();
        e2.run();
    }
}
