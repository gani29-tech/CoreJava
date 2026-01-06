package com.techouts.cj4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private static final Logger logger = Logger.getLogger(VehicleExample.class.getName());

    public static void main(String[] args) {
        List<Vehicle> vehicle = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        logger.info("How many vehicles do you want to add?");
        int numberOfVehicles = input.nextInt();
        for (int i = 1; i <= numberOfVehicles; i++) {
            logger.log(Level.INFO, "Enter vehicle {0} type", i);
            String vehicleType = input.next();
            logger.log(Level.INFO, "Enter vehicle {0} brand ", i);
            String vehicleBrand = input.next();
            logger.log(Level.INFO, "Enter vehicle {0} name ", i);
            String vehicleName = input.next();
            vehicle.add(new Vehicle(vehicleType, vehicleBrand, vehicleName));
        }
        for (Vehicle v : vehicle) {
            logger.log(Level.INFO, "{0}", v);
        }
    }
}
