package com.techouts.cj5;
interface ECU{
    void runECU();
}
interface Meter{
    void runMeter();
}
interface Radiator{
    void runRadiator();
}
class MotorCycle implements ECU, Meter, Radiator{
    @Override
    public void runECU(){
        System.out.println("ECU is running");
    }
    @Override
    public void runMeter(){
        System.out.println("Meter is running");
    }
    @Override
    public void runRadiator(){
        System.out.println("Radiator is running");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        MotorCycle m = new MotorCycle();
        m.runECU();
        m.runMeter();
        m.runRadiator();
    }
}
