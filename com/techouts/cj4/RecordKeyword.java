package com.techouts.cj4;

import java.util.logging.Level;
import java.util.logging.Logger;

record Student(int id,String name){}
public class RecordKeyword {
    private static final Logger logger = Logger.getLogger(RecordKeyword.class.getName());
    public static void main(String[] args) {
        Student student = new Student(39,"Gani");
        logger.log(Level.INFO, "{0}", student);
        logger.log(Level.INFO, "{0}", student.id());
        logger.log(Level.INFO, "{0}", student.name());
    }
}
