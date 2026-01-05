package com.techouts.assessment1;

import java.util.logging.Logger;

class Lorry {
    private static final Logger logger = Logger.getLogger(Lorry.class.getName());

    void showDetails() {
        logger.info("I am a Lorry");
    }
}

class ECU {
    Lorry lorry;

    ECU(Lorry lorry) {
        this.lorry = lorry;
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Lorry lorry = new Lorry();
        new ECU(lorry);
        lorry.showDetails();

    }
}
