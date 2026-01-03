package com.techouts.assessment1;
class Car{
    void startCar(){
        System.out.println("Engine Started");
    }
}
class Engine extends Car{
    void startEngine(){
        System.out.println("Engine is Starting");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Engine e = new Engine();
        e.startEngine();
        e.startCar();
    }
}
