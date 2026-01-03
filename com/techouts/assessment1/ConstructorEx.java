package com.techouts.assessment1;
class Bike{
    Bike(String name,String brand){
        System.out.println("Hi, I am from Parameterized Constructor");
        System.out.println("Bike Name: "+name);
        System.out.println("Bike Brand: "+brand);
    }
    Bike(){
        System.out.println("Hi, I am from Default Constructor");
    }

}

public class ConstructorEx {
    public static void main(String[] args) {
        new Bike();
        new Bike("NS200","Pulsar");

    }
}
