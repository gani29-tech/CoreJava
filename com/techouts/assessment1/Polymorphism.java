package com.techouts.assessment1;
class Company{
    String companyName;
    String companyPlace;
    void setCompanyDetails(String companyName, String companyPlace){
        this.companyName = companyName;
        this.companyPlace = companyPlace;
    }
    void displayCompanyDetails(){
        System.out.println(companyName);
        System.out.println(companyPlace);
    }
}
class TechoutsSolution extends Company{
    @Override
    void setCompanyDetails(String companyName, String companyPlace) {
        super.setCompanyDetails(companyName, companyPlace);
    }
    @Override
    void displayCompanyDetails(){
        System.out.println("TECH-OUTS Company");
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
