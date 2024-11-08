package com.xworkz.Runner;

import com.xworkz.interfaces.AirportRule;
import com.xworkz.interfaces.AirportRuleImpl;

public class AirportRuleRunner {
    public static void main(String[] args) {
        AirportRule airportRule =new AirportRuleImpl();
        airportRule.arriveBefore();
        airportRule.idProof();
    }
}
