package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

record Bus(int regNo, String name) {
}

public class SortingList {
    private static final Logger logger = Logger.getLogger(SortingList.class.getName());

    public static void main(String[] args) {
        List<Bus> list = new ArrayList<>();
        list.add(new Bus(4240, "RTC"));
        list.add(new Bus(4669, "Express"));
        list.add(new Bus(2234, "Deluxe"));
        List<Bus> sortByRegNo = new ArrayList<>(list);
        sortByRegNo.sort((a, b) -> a.regNo() - b.regNo());
        logger.log(Level.INFO, "Sorted by regNo : {0}", sortByRegNo);
        List<Bus> sortByName = new ArrayList<>(list);
        sortByName.sort((a, b) -> a.name().compareTo(b.name()));
        logger.log(Level.INFO, "Sorted by name : {0}", sortByName);
    }
}
