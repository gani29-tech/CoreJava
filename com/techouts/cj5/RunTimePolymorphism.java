package com.techouts.cj5;
class Bank{
    void RateOfInterest(){
        System.out.println("Rate of Interest");
    }
}
class Axis extends Bank {
    @Override
    public void RateOfInterest() {
        System.out.println("Axis is getting rate of interest");
    }
}
class SBI extends Bank {
    @Override
    public void RateOfInterest() {
        System.out.println("SBI is getting rate of interest");
    }
}
public class RunTimePolymorphism {
    public static void main(String[] args) {
        Bank b;
        b = new Axis();
        b.RateOfInterest();
        b = new SBI();
        b.RateOfInterest();
    }
}
