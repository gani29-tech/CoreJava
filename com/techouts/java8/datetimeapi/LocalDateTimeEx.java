package com.techouts.java8.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocalDateTimeEx {
    private static final Logger logger = Logger.getLogger(LocalDateTimeEx.class.getName());

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        logger.log(Level.INFO, "Local Date : {0}", localDate);
        LocalTime localTime = LocalTime.now();
        logger.log(Level.INFO, "Local Time : {0}", localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        logger.log(Level.INFO, "Local DateTime : {0}", localDateTime);

        LocalDate specificDate = LocalDate.of(1970, 1, 1);
        logger.log(Level.INFO, "Specific Date : {0}", specificDate);
        LocalTime specificTime = LocalTime.of(1, 1, 1);
        logger.log(Level.INFO, "Specific Time : {0}", specificTime);

    }
}
