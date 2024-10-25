package com.xworkz.Runner;

import com.xworkz.casting.*;
import com.xworkz.external.PoliceStation;
import com.xworkz.external.Railways;

public class RailwaysRunner {
    public static void main(String[] args) {
        Railways railways=new Railways();
        PublicServant servant =new PublicServant();
        railways.validateTicket(servant);

        System.out.println("===================================================");

        PoliceOfficer policeOfficer=new PoliceOfficer();
        railways.validateTicket(policeOfficer);

        System.out.println("===================================================");

        Inspector inspector=new Inspector();
        railways.validateTicket(inspector);

        System.out.println("===================================================");

        TrafficPolice trafficPolice=new TrafficPolice();
        railways.validateTicket(trafficPolice);

        System.out.println("===================================================");

        TicketCollector ticketCollector=new TicketCollector();
        railways.validateTicket(ticketCollector);

    }
}
