package com.xworkz.runner;

import com.xworkz.internal.TrafficPolice;
import com.xworkz.internal.TrafficRule;
import com.xworkz.internal.TrafficRuleImpl;

public class TrafficPoliceRunner {
    public static void main(String[] args) {

        TrafficRule trafficRule = new TrafficRuleImpl();
        trafficRule.wearingHelmet();
        trafficRule.speedLimit();
        trafficRule.TrafficLights();

    }
}
