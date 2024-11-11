package com.xworkz.internal;

public class TrafficRuleImpl implements TrafficRule{
    @Override
    public boolean wearingHelmet() {
        System.out.println("Wearing Helmet");
        return false;
    }

    @Override
    public int speedLimit() {
        System.out.println("Speed limit must be 60");
        return 0;
    }

    @Override
    public boolean TrafficLights() {
        System.out.println("Follow the traffic Light signals");
        return false;
    }
}
