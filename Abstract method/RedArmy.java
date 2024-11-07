package com.xworkz.Abstraction;

public abstract class RedArmy extends Army {

    RedArmy(int size) {
        super(size);
    }

    @Override
    public void useDrone() {
        System.out.println("Use Drone");
    }

    public abstract void useBrahmos();

}