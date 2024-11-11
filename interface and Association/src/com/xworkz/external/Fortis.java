package com.xworkz.external;

public class Fortis {
    private Hospital hospital;

    public Fortis(Hospital hospital)
    {
        this.hospital=hospital;
    }
    public void checkHospital()
    {
        boolean clean = hospital.clean();
        if(clean)
        {
            System.out.println("Hospital is clean...");
        }
        else
        {
            System.out.println("Hospital is not clean...");
        }
    }
}
