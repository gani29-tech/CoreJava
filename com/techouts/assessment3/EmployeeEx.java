package com.techouts.assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

record Employee(String name, String department) {
}

public class EmployeeEx {
    private static final Logger logger = Logger.getLogger(EmployeeEx.class.getName());

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ganesh", "IT"));
        employees.add(new Employee("Nani", "SE"));
        employees.add(new Employee("Karan", "IT"));
        employees.add(new Employee("Jonny", "IT"));
        employees.add(new Employee("Gani", "SE"));
        employees.add(new Employee("Manoj", "HR"));
        Map<String, Long> map = employees.stream().collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            logger.log(Level.INFO, "{0} -> {1}", new Object[]{entry.getKey(), entry.getValue()});
        }
    }
}
