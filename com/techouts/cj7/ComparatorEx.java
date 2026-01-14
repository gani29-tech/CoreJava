package com.techouts.cj7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

record Student(int id, String name, int age) {
}

class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.age() == s2.age()) {
            return 0;
        } else if (s1.age() > s2.age()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name().compareTo(o2.name());
    }
}

public class ComparatorEx {
    private static final Logger LOG = Logger.getLogger(ComparatorEx.class.getName());

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 35));
        students.add(new Student(2, "Jane", 20));
        students.add(new Student(3, "Julie", 28));
        Collections.sort(students, new AgeComparator());
        LOG.info("According to Age");
        for (Student s : students) {
            LOG.log(Level.INFO, "{0}", s);
        }
        LOG.info("According to Name");
        students.sort(new NameComparator());
        for (Student s : students) {
            LOG.log(Level.INFO, "{0}", s);
        }
    }
}
