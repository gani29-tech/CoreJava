package com.techouts.cj7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

record Stud(String name, int marks) {
}

class MarksComparator implements Comparator<Stud> {
    @Override
    public int compare(Stud s1, Stud s2) {
        if (s1.marks() < s2.marks()) {
            return 1;
        } else if (s1.marks() > s2.marks()) {
            return -1;
        } else {
            return s1.name().compareTo(s2.name());
        }

    }
}

public class CompareEx {
    private static final Logger logger = Logger.getLogger(CompareEx.class.getName());

    public static void main(String[] args) {
        ArrayList<Stud> students = new ArrayList<>();
        students.add(new Stud("Ganesh", 30));
        students.add(new Stud("Kal", 46));
        students.add(new Stud("Kal", 60));
        students.add(new Stud("Jonny", 60));
        students.sort(new MarksComparator());
        for (Stud stud : students) {
            logger.log(Level.INFO, "Student Name : {0} Student Marks : {1}", new Object[]{stud.name(), stud.marks()});
        }
    }
}
