package com.xworkz.Runner;

import com.xworkz.casting.*;
import com.xworkz.external.Government;
import com.xworkz.external.PoliceStation;

import java.util.Arrays;

public class GovernmentRunner {
    public static void main(String[] args) {
        Government government=new Government();
        PublicServant servant=new PublicServant();
        government.run(servant);

        System.out.println("===================================================");

        TrafficPolice trafficPolice=new TrafficPolice();
        government.run(trafficPolice);

        System.out.println("===================================================");

        Inspector inspector=new Inspector();
        government.run(inspector);

        System.out.println("===================================================");

        TicketCollector ticketCollector=new TicketCollector();
        government.run(ticketCollector);

    }
}
