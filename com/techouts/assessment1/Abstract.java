package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

abstract class Bus {
    private static final Logger logger = Logger.getLogger(Bus.class.getName());
    String busName;
    int busNo;

    void setBusDetails(String busName, int busNo) {
        this.busName = busName;
        this.busNo = busNo;
    }

    void displayBusDetails() {
        logger.log(Level.INFO, "BUS DETAILS : {0} {1}", new Object[]{busName, busNo});
    }

    abstract void updateBusDetails();

}

class Machine extends Bus {
    private static final Logger logger = Logger.getLogger(Machine.class.getName());

    @Override
    void updateBusDetails() {
        logger.info("Showing Bus Details");
    }

    @Override
    void displayBusDetails() {
        super.displayBusDetails();
    }

    @Override
    void setBusDetails(String busName, int busNo) {
        super.setBusDetails(busName, busNo);
    }
}

public class Abstract {
    public static void main(String[] args) {
        Bus b = new Machine();
        b.setBusDetails("RTC", 41);
        b.updateBusDetails();
        b.displayBusDetails();
    }
}
