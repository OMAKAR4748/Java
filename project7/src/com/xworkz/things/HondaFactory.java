package com.xworkz.things;

public class HondaFactory extends Factory{
    public HondaFactory()
    {
        super();
        System.out.println("HondaFactory");
    }
    public void manufacture()
    {
        System.out.println("HondaFactory Manufacture");
    }
    public void dispose()
    {
        System.out.println("HondaFactory Dispose");
    }
    public void power()
    {
        System.out.println("HondaFactory Power on");
    }
    public void start()
    {
        System.out.println("HondaFactory start");
    }
    public void run()
    {
        System.out.println("HondaFactory run");
    }
    public void speed()
    {
        System.out.println("HondaFactory speed");

    }
}
