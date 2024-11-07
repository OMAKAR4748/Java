package com.xworkz.Abstraction;


public class ArmyRunner {
    public static void main(String[] args) {
        WhiteArmy whiteArmy = new WhiteArmy(300);
        whiteArmy.protectBorder();
        whiteArmy.useDrone();
        whiteArmy.useBrahmos();
        System.out.println("Army Size:"+ whiteArmy.getSize());

    }
}
