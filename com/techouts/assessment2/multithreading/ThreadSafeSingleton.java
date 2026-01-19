package com.techouts.assessment2.multithreading;

import java.util.logging.Logger;

class ThreadSafeEx {
    private ThreadSafeEx() {
    }

    private static ThreadSafeEx instance;

    public static synchronized ThreadSafeEx getInstance() {
        if (instance == null) {
            instance = new ThreadSafeEx();
        }
        return instance;
    }
}

public class ThreadSafeSingleton {
    private static final Logger LOGGER = Logger.getLogger(ThreadSafeSingleton.class.getName());

    public static void main(String[] args) {
        ThreadSafeEx.getInstance();
        LOGGER.info("ThreadSafeSingleton started");
    }
}
