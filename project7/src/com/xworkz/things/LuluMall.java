package com.xworkz.things;

public class LuluMall extends Mall{
   public LuluMall(){
        super();
        System.out.println("lulumall");
    }
    public void open() {
        super.open();
        System.out.println("Lulu is open");
    }
    @Override
    public void close() {
        super.close();
        System.out.println("LuluMall is closed");
    }

    @Override
    public void elevator() {
        super.elevator();
        System.out.println("LuluMall is elevator");
    }

    @Override
    public void security() {
        super.security();
        System.out.println("LuluMall is security");
    }
    public void discount()
    {
        System.out.println("LuluMall Discount");
    }
}
