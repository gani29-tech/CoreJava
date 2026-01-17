package com.techouts.assessment2.exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TryCatchFinally {
    private static final Logger logger = Logger.getLogger(TryCatchFinally.class.getName());

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};
        try {
            //This block executes first if any exceptions occur it checks for catch method with required exception
            //and this block stops the execution and goes out to catch or finally block
            //If any Exceptions are not occur the try block executes and goes to finally block.
            for (int i = 0; i < 10; i++) {
                logger.log(Level.INFO, "Array index {0} is {1}", new Object[]{i, array[i]});
            }
        } catch (StringIndexOutOfBoundsException a) {
            //If ArrayIndexOutOfBounds Exception occur in try block it catches otherwise it goes for other catch blocks.
            logger.log(Level.WARNING, "{0}", String.valueOf(a));
        } catch (Exception e) {
            //If any other Exceptions are not matched it is the main Exception class which catch all Exceptions.
            logger.info("Inside Exception");
            logger.log(Level.WARNING, "{0}", String.valueOf(e));
        } finally {
            //This block always Executes,It is used to close the connections,networks,databases and etc.
            logger.info("It always Executes");
        }
    }
}
