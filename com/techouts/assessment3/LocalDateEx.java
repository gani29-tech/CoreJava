package com.techouts.assessment3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LocalDateEx {
    private static final Logger logger = Logger.getLogger(LocalDateEx.class.getName());

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse("2021-04-15", formatter);
        logger.log(Level.INFO, "localDate: {0}", localDate);
    }
}
