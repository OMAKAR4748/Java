package com.xworkz.interfaces;

public class AirportRuleImpl implements AirportRule {
    @Override
    public boolean arriveBefore() {
        System.out.println("Arrive Before");
        return false;
    }

    @Override
    public String idProof() {
        System.out.println("Id Proof");
        return "id proof";
    }

    @Override
    public String toString() {
        return super.toString();
    }

}


