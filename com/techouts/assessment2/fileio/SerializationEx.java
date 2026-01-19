package com.techouts.assessment2.fileio;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

import static com.techouts.assessment2.fileio.BufferedReaderEx.file;

class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class SerializationEx {
    private static final Logger LOGGER = Logger.getLogger(SerializationEx.class.getName());

    public static void main(String[] args) throws Exception {
        try (FileOutputStream fos = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student(40, "Nani"));
            students.add(new Student(39, "Ganesh"));
            oos.writeObject(students);
        }
        LOGGER.info("Serialization finished");
    }
}
