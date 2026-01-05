package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Techouts {
    String name;
    String place;
    int noOfEmployees;

    void setCompany(String name) {
        this.name = name;
    }

    void setCompany(int noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    void setCompany(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public String toString() {
        return "Tech-outs\n" + "Name: " + name + " Place: " + place + " No of Employees: " + noOfEmployees;
    }
}

class Tech extends Techouts {
    @Override
    void setCompany(String name, String place) {
        super.setCompany(name, place);
        this.name = name;
        this.place = place;
    }

    @Override
    void setCompany(int noOfEmployees) {
        super.setCompany(noOfEmployees);
        this.noOfEmployees = noOfEmployees;
    }

    @Override
    void setCompany(String name) {
        super.setCompany(name);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tech\n" + "Name: " + name + " Place: " + place + " No of Employees: " + noOfEmployees;
    }
}

public class MethodOverloadOverride {
    private static final Logger logger = Logger.getLogger(MethodOverloadOverride.class.getName());

    public static void main(String[] args) {
        Techouts tech = new Tech();
        tech.setCompany("TECH-OUTS");
        tech.setCompany("TECH-OUTS", "Hyderabad");
        tech.setCompany(450);
        logger.log(Level.INFO, "{0}", tech);
    }
}
