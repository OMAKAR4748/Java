package com.xworkz.things;

public class Factory {
    public Factory()
    {
        super();
        System.out.println("Factory");
    }
    protected void manufacture()
    {
        System.out.println("Factory Manufacture");
    }
    protected void dispose()
    {
        System.out.println("Factory Dispose");
    }
    protected void power()
    {
        System.out.println("Factory Power on");
    }
    protected void start()
    {
        System.out.println("Factory start");
    }
    protected void run()
    {
        System.out.println("Factory run");
    }
}
