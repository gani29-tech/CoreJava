package com.techouts.assessment1;

import java.util.logging.Logger;

interface OS {
    Logger logger = Logger.getLogger(OS.class.getName());

    void reboot();

    default void run() {
        logger.info("Running OS");
    }
}

class Android implements OS {
    private static final Logger logger = Logger.getLogger(Android.class.getName());

    @Override
    public void reboot() {
        logger.info("Rebooting OS");
    }
}

public class InterfaceImplementation {
    public static void main(String[] args) {
        OS os = new Android();
        os.run();
        os.reboot();
    }
}
// Abstraction : Hiding Implementation details and showing necessary features
