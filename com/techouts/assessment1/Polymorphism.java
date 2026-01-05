package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Company {
    private static final Logger logger = Logger.getLogger(Company.class.getName());
    String companyName;
    String companyPlace;

    void setCompanyDetails(String companyName, String companyPlace) {
        this.companyName = companyName;
        this.companyPlace = companyPlace;
    }

    void displayCompanyDetails() {
        logger.log(Level.INFO, "{0}", companyName);
        logger.log(Level.INFO, "{0}", companyPlace);
    }
}

class TechoutsSolution extends Company {
    private static final Logger logger = Logger.getLogger(TechoutsSolution.class.getName());

    @Override
    void setCompanyDetails(String companyName, String companyPlace) {
        super.setCompanyDetails(companyName, companyPlace);
    }

    @Override
    void displayCompanyDetails() {
        logger.info("TECH-OUTS SOLUTION");
        super.displayCompanyDetails();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Company company = new TechoutsSolution();
        company.setCompanyDetails("TECH-OUTS", "Hyderabad");
        company.displayCompanyDetails();
    }
}
