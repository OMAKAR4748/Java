package com.xworkz.things;

public class HyundaiFactory extends Factory{
    public HyundaiFactory()
    {
        super();
        System.out.println("HyundaiFactory");
    }
    public void manufacture()
    {
        System.out.println("HyundaiFactory Manufacture");
    }
    public void dispose()
    {
        System.out.println("HyundaiFactory Dispose");
    }
    public void power()
    {
        System.out.println("HyundaiFactory Power on");
    }
    public void start()
    {
        System.out.println("HyundaiFactory start");
    }
    public void run()
    {
        System.out.println("HyundaiFactory run");
    }
    public void holiday()
    {
        System.out.println("HyundaiFactory holiday");
    }
}
