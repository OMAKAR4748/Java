package com.xworkz.Runner;

import com.xworkz.interfaces.TrafficRule;
import com.xworkz.interfaces.TrafficRuleImpl;

public class TrafficRuleRunner {
    public static void main(String[] args) {
        TrafficRule trafficRule = new TrafficRuleImpl();
        trafficRule.speedLimit();
        trafficRule.wearingHelmet();
    }
}
