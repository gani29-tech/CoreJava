package com.techouts.assessment1;
class Company{
    String companyName;
    String companyPlace;
    void setCompanyDetails(String companyName, String companyPlace){
        this.companyName = companyName;
        this.companyPlace = companyPlace;
    }
    void displayCompanyDetails(){
        System.out.print(companyName+" ");
        System.out.println(companyPlace);
    }
}
class InfoTech extends Company{
    @Override
    void setCompanyDetails(String companyName, String companyPlace) {
        super.setCompanyDetails(companyName, companyPlace);
    }
    @Override
    void displayCompanyDetails(){
        System.out.print("INFO-TECH COMPANY DETAILS : ");
        super.displayCompanyDetails();
    }
}
class TechoutsSolution extends Company{
    @Override
    void setCompanyDetails(String companyName, String companyPlace) {
        super.setCompanyDetails(companyName, companyPlace);
    }
    @Override
    void displayCompanyDetails(){
        System.out.print("TECH-OUTS COMPANY DETAILS : ");
        super.displayCompanyDetails();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Company company1 = new TechoutsSolution();
        company1.setCompanyDetails("TECH-OUTS", "Hyderabad");
        company1.displayCompanyDetails();
        Company company2 = new InfoTech();
        company2.setCompanyDetails("INFO-TECH", "Bangalore");
        company2.displayCompanyDetails();
    }
}
