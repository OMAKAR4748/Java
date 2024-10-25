package com.xworkz.external;

import com.xworkz.casting.Inspector;
import com.xworkz.casting.PoliceOfficer;
import com.xworkz.casting.TrafficPolice;

public class PoliceStation {
    public void justice(PoliceOfficer officer)
    {
        System.out.println("Justice");
        officer.protectIPC();
        officer.controlCrime();


        if (officer instanceof Inspector)
        {
            Inspector inspector=(Inspector) officer;
            inspector.controlCrime();
            inspector.controlStation();
            inspector.protectIPC();
        }
        if (officer instanceof TrafficPolice)
        {
            TrafficPolice trafficPolice=(TrafficPolice) officer;
            trafficPolice.controlTraffic();
            trafficPolice.protectIPC();
            trafficPolice.controlCrime();
        }

    }
}
