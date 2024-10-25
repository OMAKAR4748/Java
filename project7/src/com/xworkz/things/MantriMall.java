package com.xworkz.things;

public class MantriMall extends Mall{
    public MantriMall()
    {
        super();
        System.out.println("MantriMall");
    }
    @Override
    public void open() {
        super.open();
        System.out.println("MantriMall is open");
    }
    @Override
    public void close() {
        super.close();
        System.out.println("MantriMall is closed");
    }

    @Override
    public void elevator() {
        super.elevator();
        System.out.println("MantriMall  elevator");
    }

    @Override
    public void security() {
        super.security();
        System.out.println("MantriMall security");
    }
    public void time()
    {
        System.out.println("MantriMall timing");
    }
}
