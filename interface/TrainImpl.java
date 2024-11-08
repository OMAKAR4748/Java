package com.xworkz.interfaces;

public class TrainImpl implements Train{
    @Override
    public void dateTime() {
        System.out.println("Train date and Timing");
    }

    @Override
    public void ticketNumber() {
        System.out.println("Train ticket Number");
    }

    @Override
    public void source() {
        System.out.println("Source");
    }

    @Override
    public void destination() {
        System.out.println("Destination");
    }

    @Override
    public void speed() {
        System.out.println("Train Speed");
    }
}
