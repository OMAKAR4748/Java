package com.xworkz.things;

public class OrionMall extends Mall{
    public OrionMall()
    {
        super();
        System.out.println("orion mall");
    }

    @Override
    public void open() {
        super.open();
        System.out.println("OrionMall is open");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("OrionMall is closed");
    }

    @Override
    public void elevator() {
        super.elevator();
        System.out.println("OrionMall is elevator");
    }

    @Override
    public void security() {
        super.security();
        System.out.println("OrionMall is security");
    }
    public void sales()
    {
        System.out.println("OrionMall Sales");
    }
}
