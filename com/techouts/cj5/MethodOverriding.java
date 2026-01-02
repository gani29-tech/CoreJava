package com.techouts.cj5;
class Bike{
    void startEngine(){
        System.out.println("Bike Engine Started");
    }
}
class Car extends Bike{
    @Override
    void  startEngine(){
        super.startEngine();
        System.out.println("Car Engine Started");
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        Car car = new Car();
        car.startEngine();
    }
}
