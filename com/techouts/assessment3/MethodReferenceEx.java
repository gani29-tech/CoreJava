package com.techouts.assessment3;

import java.util.logging.Logger;

interface Instance {
    void show();
}

class InstanceExample {
    private static final Logger logger = Logger.getLogger(InstanceExample.class.getName());

    public static void display() {
        logger.info("Instance Method Reference");
    }

}

public class MethodReferenceEx {
    public static void main(String[] args) {
        Instance instanceExample = InstanceExample::display;
        instanceExample.show();
    }
}
