package com.techouts.assessment2.fileio;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import static com.techouts.assessment2.fileio.BufferedReaderEx.file;

public class DeSerializationEx {
    private static final Logger logger = Logger.getLogger(DeSerializationEx.class.getName());

    public static void main(String[] args) throws Exception {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            List<Student> students = (List<Student>) ois.readObject();
            for (Student s : students) {
                logger.log(Level.INFO, "Student id : {0} Student Name : {1}", new Object[]{s.id, s.name});
            }
        }
    }
}
