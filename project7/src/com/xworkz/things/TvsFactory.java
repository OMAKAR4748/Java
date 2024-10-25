package com.xworkz.things;

public class TvsFactory extends Factory{
    public TvsFactory()
    {
        super();
        System.out.println("TvsFactory");
    }
    public void manufacture()
    {
        System.out.println("TvsFactory Manufacture");
    }
    public void dispose()
    {
        System.out.println("TvsFactory Dispose");
    }
    public void power()
    {
        System.out.println("TvsFactory Power on");
    }
    public void start()
    {
        System.out.println("TvsFactory start");
    }
    public void run()
    {
        System.out.println("TvsFactory run");
    }
    public void time()
    {
        System.out.println("TvsFactory time");
    }
}
