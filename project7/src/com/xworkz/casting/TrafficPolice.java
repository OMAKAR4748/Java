package com.xworkz.casting;

public class TrafficPolice extends PoliceOfficer{
    public void controlTraffic()
    {
        System.out.println("control traffic");
    }

    @Override
    public void controlCrime() {
        super.controlCrime();
    }
}
