package com.techouts.cj7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

class Emp implements Comparable<Emp> {
    int id;
    String name;
    int age;

    Emp(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int compareTo(Emp e) {
        if (this.age > e.age) {
            return 1;
        } else if (this.age < e.age) {
            return -1;
        } else {
            return 0;
        }
    }

}

public class ComparableEx {
    private static final Logger logger = Logger.getLogger(ComparableEx.class.getName());

    public static void main(String[] args) {
        ArrayList<Emp> students = new ArrayList<>();
        Emp s1 = new Emp(1, "Gani", 25);
        Emp s2 = new Emp(2, "Ganesh", 21);
        Emp s3 = new Emp(3, "Jonny", 23);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        Collections.sort(students);
        for (Emp e : students) {
            logger.log(Level.INFO, "Emp Id : {0} Emp Name : {1} Emp Age : {2}", new Object[]{e.id, e.name, e.age});
        }
    }
}
