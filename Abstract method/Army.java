package com.xworkz.Abstraction;

public abstract class Army {
    int size;
    Army(int size) {
        this.size = size;
    }

    public void protectBorder() {
        System.out.println("Protect Border");
    }

    public abstract void useDrone();

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Army{" +
                "size=" + size +
                '}';
    }
}
