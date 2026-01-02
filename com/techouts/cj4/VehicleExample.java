package com.techouts.cj4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

record Vehicle(String vehicleType, String vehicleBrand, String vehicleName) {

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleType='" + vehicleType + '\'' +
                ", vehicleBrand='" + vehicleBrand + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        List<Vehicle> vehicle= new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("How many vehicles do you want to add?");
        int numberOfVehicles = input.nextInt();
        for(int i=1;i<=numberOfVehicles;i++) {
            System.out.println("Enter vehicle "+i+" type");
            String vehicleType = input.next();
            System.out.println("Enter vehicle "+i+" brand");
            String vehicleBrand = input.next();
            System.out.println("Enter vehicle "+i+" name");
            String vehicleName = input.next();
            vehicle.add(new Vehicle(vehicleType,vehicleBrand,vehicleName));
        }
        for(Vehicle v:vehicle) {
            System.out.println(v);
        }
    }
}
