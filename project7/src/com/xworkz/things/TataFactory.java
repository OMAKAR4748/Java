package com.xworkz.things;

public class TataFactory extends Factory{
    public TataFactory(){
        super();
        System.out.println("TataFactory");
    }
    public void manufacture()
    {
        System.out.println("TataFactory Manufacture");
    }
    public void dispose()
    {
        System.out.println("TataFactory Dispose");
    }
    public void power()
    {
        System.out.println("TataFactory Power on");
    }
    public void start()
    {
        System.out.println("TataFactory start");
    }
    public void run()
    {
        System.out.println("TataFactory run");
    }
    public void sales()
    {
        System.out.println("TataFactory sales");
    }
}
