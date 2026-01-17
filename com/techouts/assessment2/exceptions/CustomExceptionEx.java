package com.techouts.assessment2.exceptions;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class LowQualityException extends Exception {
    public LowQualityException(String message) {
        super(message);
    }
}

public class CustomExceptionEx {
    private static final Logger logger = Logger.getLogger(CustomExceptionEx.class.getName());

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            logger.info("Enter the Quality of Item: Low or High ");
            String itemQuality = scanner.next();
            if (itemQuality.equals("Low") || itemQuality.equals("low")) {
                logger.info("Ok we resolve it ,Thank for feedback");
                throw new LowQualityException("The Item Quality is Low!!!");
            } else {
                logger.info("Thank you for Feedback");
            }
        } catch (LowQualityException l) {
            logger.log(Level.WARNING, "{0}", l.getMessage());
        }
    }
}
