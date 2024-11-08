package com.xworkz.interfaces;

public class TrafficRuleImpl implements TrafficRule{
    @Override
    public boolean wearingHelmet() {
        System.out.println("wearing Helmet ");
        return true;
    }

    @Override
    public int speedLimit() {
        System.out.println("speed limit maximum 60");
        return 60;
    }
}
