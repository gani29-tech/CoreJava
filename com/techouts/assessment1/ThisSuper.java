package com.techouts.assessment1;

import java.util.logging.Level;
import java.util.logging.Logger;

class Computer{
    private static final Logger logger = Logger.getLogger(Computer.class.getName());
    String computerName;
    String computerBrand;
    void setComputerDetails(String computerName, String computerBrand){
        this.computerName = computerName;
        this.computerBrand = computerBrand;
    }
    void displayComputerDetails(){
        logger.log(Level.INFO,"Computer Name is {0} , Computer Brand is {1} ",new Object[]{computerName,computerBrand});
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
