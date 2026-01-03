package com.techouts.assessment1;
class Techouts{
    String name;
    String place;
    int noOfEmployees;
    void setCompany(String name){
        this.name = name;
    }
    void setCompany(int noOfEmployees){
        this.noOfEmployees = noOfEmployees;
    }
    void setCompany(String name,String place){
        this.name = name;
        this.place = place;
    }
    public String toString(){
        return "Tech-outs\n"+"Name: "+name+" Place: "+place+" No of Employees: "+noOfEmployees;
    }
}
class Tech extends Techouts{
    @Override
    void setCompany(String name,String place){
        super.setCompany(name,place);
        this.name = name;
        this.place = place;
    }
    @Override
    void setCompany(int noOfEmployees){
        super.setCompany(noOfEmployees);
        this.noOfEmployees = noOfEmployees;
    }
    @Override
    void setCompany(String name){
        super.setCompany(name);
        this.name = name;
    }
    @Override
    public String toString(){
        System.out.println(super.toString());
        return "Tech\n"+"Name: "+name+" Place: "+place+" No of Employees: "+noOfEmployees;
    }
}

public class MethodOverloadOverride {
    public static void main(String[] args) {
        Techouts tech = new Tech();
        tech.setCompany("TECH-OUTS");
        tech.setCompany("TECH-OUTS","Hyderabad");
        tech.setCompany(450);
        System.out.println(tech);
    }
}
