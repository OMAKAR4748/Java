package com.xworkz.Runner;

import com.xworkz.interfaces.CityBus;

public class VehicleRunner {
    public static void main(String[] args) {
        CityBus myBus = new CityBus(50, "1");
        myBus.start();
        myBus.boardPassengers();
        System.out.println("Number of Seats: " + myBus.getNumberOfSeats());
        System.out.println("Bus Route: " + myBus.getRoute());
        myBus.alightPassengers();
        myBus.stop();
        }
}
