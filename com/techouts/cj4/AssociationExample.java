package com.techouts.cj4;
public class AssociationExample {
    public static void main(String[] args) {
        Engine engine=new Engine();
        Car car=new Car();
        ECU ecu=new ECU();
        car.useECU(ecu);
        car.useEngine(engine);
    }
}
