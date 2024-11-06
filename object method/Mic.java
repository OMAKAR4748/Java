package com.xworkz.instance;

public class Mic {
    String brand;
    double wireLength;
    double cost;


    public Mic(String brand, double wireLength, double cost) {
        this.brand = brand;
        this.wireLength = wireLength;
        this.cost = cost;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Mic) {
            System.out.println("Mic is on");
        Mic mic = (Mic) obj;
        if (brand.equals(mic.brand) && wireLength == mic.wireLength && cost == mic.cost) {
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
