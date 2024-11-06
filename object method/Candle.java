package com.xworkz.instance;

public class Candle{
    String color;
    double cost;
    boolean perfumed;


    public Candle(String color, double cost, boolean perfumed) {
        this.color = color;
        this.cost = cost;
        this.perfumed = perfumed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null) return false;
        if (obj instanceof Candle) {
            System.out.println("Candle");
            Candle candle = (Candle) obj;
            if (color.equals(candle.color) && cost == candle.cost && perfumed == candle.perfumed) {
                System.out.println("same");
                return true;
            } else {
                System.out.println("not be same");
            }
        }
        return false;
    }
}
