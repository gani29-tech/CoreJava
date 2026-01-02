package com.techouts.cj4;

class Car{
    public void useECU(ECU ecu){
        ecu.runECU();
        System.out.println("ECU is started");
        ecu.stopECU();
        System.out.println("ECU is stopped");
    }
    public void useEngine(Engine engine){
        engine.startEngine();
        System.out.println("Engine is Started");
        engine.stopEngine();
        System.out.println("Engine is Stopped");
    }

}
