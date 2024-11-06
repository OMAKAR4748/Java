package com.xworkz.instance;

public class Cracker {
    String name;
    double cost;


    public Cracker(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj==null) return true;
        if (obj instanceof Cracker)
        {
            System.out.println("Cracker");
        Cracker cracker = (Cracker) obj;
        if(name.equals(cracker.name) && cost == cracker.cost){
        System.out.println("same");
        return true;
        }
        else {
        System.out.println("not be same");
    }
}
    return false;
    }


}
