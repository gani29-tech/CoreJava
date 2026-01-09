    package com.techouts.multithreading;

    import java.util.logging.Logger;

    class VolatileKeyword extends Thread{
        private volatile boolean flag=true;
        public static final Logger logger = Logger.getLogger(VolatileKeyword.class.getName());

        @Override
        public void run() {
            while (flag) {
                logger.info("Running");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public void stopRun(){
            logger.info("Stopping");
            flag=false;
        }
    }
    class VolatileExample {
        public static void main(String[] args) throws InterruptedException {
            VolatileKeyword vk=new VolatileKeyword();
            vk.start();
            Thread.sleep(200);
            vk.stopRun();
        }
    }
