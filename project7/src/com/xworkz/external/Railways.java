package com.xworkz.external;

import com.xworkz.casting.Inspector;
import com.xworkz.casting.PublicServant;
import com.xworkz.casting.TicketCollector;
import com.xworkz.casting.TrafficPolice;

public class Railways {
    public void validateTicket(PublicServant servant)
    {
        System.out.println("Validate Ticket");
        servant.protectIPC();

        if (servant instanceof TicketCollector)
        {
            TicketCollector ticketCollector=(TicketCollector) servant;
            ticketCollector.checkTicket();
            ticketCollector.protectIPC();
        }
        if (servant instanceof Inspector)
        {
            Inspector inspector=(Inspector) servant;
            inspector.protectIPC();
            inspector.controlCrime();
            inspector.controlStation();
        }
        if (servant instanceof TrafficPolice)
        {
            TrafficPolice trafficPolice=(TrafficPolice) servant;
            trafficPolice.controlTraffic();
            trafficPolice.controlCrime();
            trafficPolice.protectIPC();
        }


    }

}
