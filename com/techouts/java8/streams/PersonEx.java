package com.techouts.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

record Person(int age, String name) {
}

public class PersonEx {
    private static final Logger logger = Logger.getLogger(PersonEx.class.getName());

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(19, "Gani"));
        people.add(new Person(20, "Nani"));
        people.add(new Person(38, "Ganesh"));
        people.add(new Person(39, "Jonny"));
        List<Person> greater;
        greater = people.stream().filter(person -> person.age() > 30).toList();
        for (Person person : greater) {
            logger.log(Level.INFO, "Person Name : {0} and Age : {1}", new Object[]{person.name(), person.age()});
        }
    }
}
