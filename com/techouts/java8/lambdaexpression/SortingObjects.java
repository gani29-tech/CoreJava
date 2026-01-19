package com.techouts.java8.lambdaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

record Student(int id, String name) {
}

public class SortingObjects {
    private static final Logger logger = Logger.getLogger(SortingObjects.class.getName());

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(39, "Ganesh"));
        list.add(new Student(40, "Faisal"));
        list.add((new Student(41, "Idris")));
        List<Student> sortById = new ArrayList<>(list);
        List<Student> sortByName = new ArrayList<>(list);
        sortById.sort((a, b) -> a.id() - b.id());
        sortByName.sort((a, b) -> a.name().compareTo(b.name()));
        logger.log(Level.INFO, "List : {0}", list);
        logger.log(Level.INFO, "Sort by id: {0}", sortById);
        logger.log(Level.INFO, "Sort by name: {0}", sortByName);
    }
}
