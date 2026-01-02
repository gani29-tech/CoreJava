package com.techouts.cj4;
class Pulsar{
    Engine engine=new Engine();
    public void startBike(){
        engine.startEngine();
        System.out.println("Pulsar Bike Started");
    }
    public void stopBike(){
        engine.stopEngine();
        System.out.println("Pulsar Bike Stopped");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Pulsar pulsar=new Pulsar();
        pulsar.startBike();
        pulsar.stopBike();

    }
}
