package com.xworkz.Abstraction;

public abstract class Hotel {
    public void service()
    {
        System.out.println("Running service in hotel");
    }
    public void advanceBooking()
    {
        System.out.println("Running advance booking in hotel");
    }
    public abstract void portableRoom();

    @Override
    public String toString() {
        return super.toString();
    }
}
