package com.xworkz.event.exceptional;

public class StackCreator {
    public void frame1()
    {
        System.out.println("running frame1");
        frame2();
    }
    public void frame2()
    {
        System.out.println("running frame2");
        frame3();
    }
    public void frame3()
    {
        System.out.println("running frame3");
        frame4();
    }
    public void frame4()
    {
        System.out.println("running frame4");
        frame5();
    }
    public void frame5()
    {
        System.out.println("running frame5");
        throw new LogicException();
    }
}
