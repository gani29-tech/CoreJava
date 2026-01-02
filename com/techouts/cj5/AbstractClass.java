package com.techouts.cj5;
abstract class Engine{
    int a=90;
    Engine(){
        System.out.println("Engine");
    }
    private void change(){
        System.out.println("change");
    }
    public void stop(){
        change();
        System.out.println("stop");
    }
    final void  start(){
        System.out.println("start");
    }
    static void check(){
        System.out.println("check");
    }
    abstract void run();
}
class Bus extends Engine{
    @Override
    void run(){
        System.out.println("Bus is running");
    }
}
class Train extends Bus{
    @Override
    void run(){
        System.out.println("Train is running");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Engine e2 = new Train();
        e2.start();
        e2.run();
        e2.stop();
        Engine.check();
        System.out.println(e2.a);
    }
}
