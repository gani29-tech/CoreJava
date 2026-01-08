    package com.techouts.multithreading;

    import java.util.logging.Level;
    import java.util.logging.Logger;

    class VolatileData{
        private volatile int counter = 0;

        public int getA() {
            return counter;
        }

        public void incrementA() {
            counter=counter+1;
        }
    }
    class VolatileExample extends Thread{
        private static final Logger logger = Logger.getLogger(VolatileExample.class.getName());
        private final VolatileData data;
        public VolatileExample(VolatileData data){
            this.data=data;
        }
        @Override
        public void run() {
            int oldValue= data.getA();
            logger.log(Level.INFO,"Thread - {0} oldValue is {1}",new Object[]{Thread.currentThread().threadId(),oldValue});
            data.incrementA();
            int  newValue= data.getA();
            logger.log(Level.INFO,"Thread - {0} new value is {1}",new Object[]{Thread.currentThread().threadId(),newValue});
        }
    }
       public class VolatileKeyword {
        private static final int NO_OF_THREADS = 3;
        public static void main(String[] args) throws InterruptedException {
            VolatileData data=new VolatileData();
            Thread[] threads=new Thread[NO_OF_THREADS];
            for(int i = 0; i< NO_OF_THREADS; i++){
                threads[i]=new VolatileExample(data);
            }
            for(int i = 0; i< NO_OF_THREADS; i++){
                threads[i].start();
            }
            for(int i = 0; i< NO_OF_THREADS; i++){
                threads[i].join();
            }
        }
    }
