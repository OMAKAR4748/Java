package com.xworkz.external;

import com.xworkz.casting.*;

public class Government {
    public void run(PublicServant servant)
    {
        System.out.println("run");
        servant.protectIPC();

        if (servant instanceof PoliceOfficer)
        {
            PoliceOfficer policeOfficer=(PoliceOfficer) servant;
            policeOfficer.controlCrime();
            policeOfficer.protectIPC();
        }
        if (servant instanceof Inspector)
        {
            Inspector inspector=(Inspector) servant;
            inspector.controlStation();
            inspector.protectIPC();
            inspector.controlStation();
        }
        if (servant instanceof TrafficPolice)
        {
            TrafficPolice trafficPolice=(TrafficPolice) servant;
            trafficPolice.controlTraffic();
            trafficPolice.protectIPC();
            trafficPolice.controlCrime();
        }
        if (servant instanceof TicketCollector)
        {
            TicketCollector ticketCollector=(TicketCollector) servant;
            ticketCollector.checkTicket();
            ticketCollector.protectIPC();
        }
    }
}
