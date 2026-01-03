package com.techouts.assessment1;
class Computer{
    String computerName;
    String computerBrand;
    void setComputerDetails(String computerName, String computerBrand){
        this.computerName = computerName;
        this.computerBrand = computerBrand;
    }
    void displayComputerDetails(){
        System.out.println("Computer Name: " + computerName+"\nComputer Brand: "+computerBrand);
    }
}
class Desktop extends Computer{
    @Override
    void setComputerDetails(String computerName, String computerBrand) {
        super.setComputerDetails(computerName, computerBrand);
    }
    @Override
    void displayComputerDetails(){
        super.displayComputerDetails();
    }
}
public class ThisSuper {
    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.setComputerDetails("Dell110","Dell");
        computer.displayComputerDetails();
    }
}
