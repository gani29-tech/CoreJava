package com.techouts.assessment1;
abstract class Bus{
    String busName;
    int busNo;
    void setBusDetails(String busName, int busNo){
        this.busName = busName;
        this.busNo = busNo;
    }
    void displayBusDetails(){
        System.out.print("BUS DETAILS : "+busName+" "+busNo);
    }
    abstract void updateBusDetails();

}
class Machine extends Bus{
    @Override
    void updateBusDetails() {
        System.out.println("Showing Bus Details");
    }
    @Override
    void displayBusDetails(){
        super.displayBusDetails();
    }
    @Override
    void setBusDetails(String busName, int busNo){
        super.setBusDetails(busName, busNo);
    }
}
public class Abstract {
    public static void main(String[] args) {
        Bus b = new Machine();
        b.setBusDetails("RTC", 41);
        b.updateBusDetails();
        b.displayBusDetails();
    }
}
