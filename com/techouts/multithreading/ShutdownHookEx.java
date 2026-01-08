package com.techouts.multithreading;

import java.util.logging.Logger;

class Message extends Thread{
    private static final Logger logger  = Logger.getLogger(Message.class.getName());
    @Override
    public void run() {
        try {
            logger.info("Bye");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ShutdownHookEx{
    private static final Logger logger = Logger.getLogger(ShutdownHookEx.class.getName());
    public static void main(String[] args) throws InterruptedException {
        Message message = new Message();
        Runtime runtime = Runtime.getRuntime();

        runtime.addShutdownHook(message);
        logger.info("Starting Program");
       //runtime.removeShutdownHook(message);
        logger.info("Program Stopped");
    }
}
