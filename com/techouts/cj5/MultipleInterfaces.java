package com.techouts.cj5;

import java.util.logging.Logger;

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
    private static final Logger logger =  Logger.getLogger(MotorCycle.class.getName());
    @Override
    public void runECU(){
        logger.info("ECU is running");
    }
    @Override
    public void runMeter(){
        logger.info("Meter is running");
    }
    @Override
    public void runRadiator(){
        logger.info("Radiator is running");
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
