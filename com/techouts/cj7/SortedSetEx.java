package com.techouts.cj7;

import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

record Employee(int id, String name) implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

}

public class SortedSetEx {
    private static final Logger logger = Logger.getLogger(SortedSetEx.class.getName());

    public static void main(String[] args) {
        var set = new TreeSet<Employee>();
        Employee e1 = new Employee(40, "Ganesh");
        Employee e2 = new Employee(38, "Jonny");
        Employee e3 = new Employee(41, "Gani");
        Employee e4 = new Employee(42, "Gani");
        set.add(e1);
        set.add(e2);
        set.add(e3);

        for (Employee e : set) {
            logger.log(Level.INFO, "Employee Id : {0} and Employee Name : {1} ", new Object[]{e.id(), e.name()});
        }
        logger.log(Level.INFO, "{0}", set.first());
        logger.log(Level.INFO, "{0}", set.last());
        logger.log(Level.INFO, "{0}", set.ceiling(e4));
        logger.log(Level.INFO, "{0}", set.floor(e4));
        logger.log(Level.INFO, "{0}", set.lower(e4));
        logger.log(Level.INFO, "{0}", set.higher(e4));
        logger.log(Level.INFO, "Headset : {0}", set.headSet(e2));
        logger.log(Level.INFO, "{0}", set.tailSet(e2));
        logger.log(Level.INFO, "{0}", set.subSet(e1, e3));
    }
}

