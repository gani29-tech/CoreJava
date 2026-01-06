package com.techouts.cj5;

import java.util.logging.Level;
import java.util.logging.Logger;

class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class EncapsulationEx {
    private static final Logger logger = Logger.getLogger(EncapsulationEx.class.getName());

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Babu", 23);
        logger.log(Level.INFO, "{0}", teacher);
        teacher.setAge(24);
        teacher.setName("Prashanth");
        logger.log(Level.INFO, "Teacher name is {0}", teacher.getAge());
        logger.log(Level.INFO, "Teacher name is {0}", teacher.getName());

    }
}
