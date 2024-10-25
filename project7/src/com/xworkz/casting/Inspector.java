package com.xworkz.casting;

public class Inspector extends PoliceOfficer{
     public void controlStation()
     {
         System.out.println("control station");
     }

    @Override
    public void controlCrime() {
        super.controlCrime();
    }
}
