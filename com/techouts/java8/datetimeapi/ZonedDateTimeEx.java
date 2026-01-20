package com.techouts.java8.datetimeapi;

import java.time.ZonedDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ZonedDateTimeEx {
    private static final Logger LOGGER = Logger.getLogger(ZonedDateTimeEx.class.getName());

    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        LOGGER.log(Level.INFO, "ZonedDateTime : {0}", zonedDateTime);
        LOGGER.log(Level.INFO, "ZonedDate : {0}", zonedDateTime.toLocalDate());
        LOGGER.log(Level.INFO, "ZonedTime : {0}", zonedDateTime.toLocalTime());
    }
}
