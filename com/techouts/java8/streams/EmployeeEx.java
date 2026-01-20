package com.techouts.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

record Employee(String name, double salary) {
}

public class EmployeeEx {
    private static final Logger logger = Logger.getLogger(EmployeeEx.class.getName());

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ganesh", 25000));
        employees.add(new Employee("Nani", 24321));
        employees.add(new Employee("Jonny", 64321));
        employees.add(new Employee("Gani", 26753));
        employees.stream()
                .map(Employee::salary)
                .max(Double::compare)
                .ifPresent(a-> logger.log(Level.INFO, "Employee {0}", a));
    }
}
