package com.techouts.cj4;

class Bike{
    Engine engine;

    public Bike(Engine engine) {
        this.engine=engine;
    }

    void startBike(){
        engine.startEngine();
        System.out.println("Bike is running");
    }
    void stopBike(){
        engine.stopEngine();
        System.out.println("Bike is stopped");
    }
}
public class AggregationExample {
    public static void main(String[] args) {
        Engine engine=new Engine();
        Bike bike=new Bike(engine);
        bike.startBike();
        bike.stopBike();
    }
}
