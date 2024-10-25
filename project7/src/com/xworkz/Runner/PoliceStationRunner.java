package com.xworkz.Runner;

import com.xworkz.casting.Inspector;
import com.xworkz.casting.PoliceOfficer;
import com.xworkz.casting.PublicServant;
import com.xworkz.casting.TrafficPolice;
import com.xworkz.external.PoliceStation;

public class PoliceStationRunner {
    public static void main(String[] args) {
        PoliceStation policeStation=new PoliceStation();

        System.out.println("===================================================");

        PoliceOfficer policeOfficer=new PoliceOfficer();
        policeStation.justice(policeOfficer);

        System.out.println("===================================================");

        TrafficPolice trafficPolice=new TrafficPolice();
        policeStation.justice(trafficPolice);

        System.out.println("===================================================");

        Inspector inspector=new Inspector();
        policeStation.justice(inspector);

    }
}
