package com.techouts.cj5;

import java.util.logging.Logger;

class Bank {
    private static final Logger logger = Logger.getLogger(Bank.class.getName());

    void rateOfInterest() {
        logger.info("Rate of Interest");
    }
}

class Axis extends Bank {
    private static final Logger logger = Logger.getLogger(Axis.class.getName());

    @Override
    public void rateOfInterest() {
        logger.info("Axis is getting rate of interest");
    }
}

class SBI extends Bank {
    private static final Logger logger = Logger.getLogger(SBI.class.getName());

    @Override
    public void rateOfInterest() {
        logger.info("SBI is getting rate of interest");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Bank b;
        b = new Axis();
        b.rateOfInterest();
        b = new SBI();
        b.rateOfInterest();
    }
}
