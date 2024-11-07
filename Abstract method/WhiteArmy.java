package com.xworkz.Abstraction;

public class WhiteArmy extends RedArmy {

    WhiteArmy(int size) {
        super(size);
    }

    @Override
    public void useBrahmos() {
        System.out.println("Use Brahmos in WhiteArmy");
    }

    @Override
    public void useDrone() {
        System.out.println("Use Drone");
    }

    @Override
    public int getSize() {
        return super.getSize();
    }
}
