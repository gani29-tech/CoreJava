package com.techouts.assessment1;
class Lorry{
    void showDetails(){
        System.out.println("I am Lorry");
    }
}
class ECU{
    Lorry lorry;
    ECU(Lorry lorry){
        this.lorry=lorry;
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Lorry lorry=new Lorry();
        new ECU(lorry);
        lorry.showDetails();

    }
}
