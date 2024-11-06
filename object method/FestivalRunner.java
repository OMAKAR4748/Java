package com.xworkz.Runner;
import com.xworkz.instance.*;

public class FestivalRunner {
    public static void main(String[] args) {

        Festival festival1 = new Festival("Diwali", "2024-11-12", "Lakshmi");
        Festival festival2 = new Festival("Diwali", "2024-11-12", "Lakshmi");
        System.out.println("Festivals equal: " + festival1.equals(festival2));


        Mic mic1 = new Mic("Sony", 1.5, 50);
        Mic mic2 = new Mic("Sony", 1.5, 50);
        System.out.println("Mics equal: " + mic1.equals(mic2));


        Cracker cracker1 = new Cracker("Sparklers", 20);
        Cracker cracker2 = new Cracker("Sparklers", 20);
        System.out.println("Crackers equal: " + cracker1.equals(cracker2));


        Candle candle1 = new Candle("Red", 15, true);
        Candle candle2 = new Candle("Red", 15, true);
        System.out.println("Candles equal: " + candle1.equals(candle2));


        Rocket rocket1 = new Rocket("SpaceX", 1000000, "Elon Musk");
        Rocket rocket2 = new Rocket("SpaceX", 1000000, "Elon Musk");
        System.out.println("Rockets equal: " + rocket1.equals(rocket2));
    }
}
