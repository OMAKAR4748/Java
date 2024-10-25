package com.xworkz.things;

public class IplCricket  extends Cricket{

    @Override
    public void schedule() {
        System.out.println("Running schedule in Cricket..");
    }
    public void prizeMoney()
    {
        System.out.println("Running prizeMoney in IplCricket....");
    }
}
