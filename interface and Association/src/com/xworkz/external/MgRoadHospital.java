package com.xworkz.external;

public class MgRoadHospital implements Hospital{
    @Override
    public boolean clean() {
        System.out.println("MgRoad Hospital is clean...");
        return false;
    }
}
