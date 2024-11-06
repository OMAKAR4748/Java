package com.xworkz.instance;

public class Rocket{
    String company;
    double budget;
    String ceoName;


    public Rocket(String company, double budget, String ceoName) {
        this.company = company;
        this.budget = budget;
        this.ceoName = ceoName;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (obj instanceof Rocket)
        {
            System.out.println("Rocket");
        Rocket rocket = (Rocket) obj;
        if(company.equals(rocket.company) && budget == rocket.budget && ceoName.equals(rocket.ceoName))
        {
                System.out.println("same");
                return true;
        }
        else{
            System.out.println("not be same");

        }
        }
        return false;
    }
}
