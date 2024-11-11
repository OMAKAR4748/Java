package com.xworkz.runner;

import com.xworkz.external.Fortis;
import com.xworkz.external.Hospital;
import com.xworkz.external.MgRoadHospital;

public class FortisRunner {
    public static void main(String[] args) {
        Hospital hospital =new MgRoadHospital();

        Fortis fortis =new Fortis(hospital);
        fortis.checkHospital();
    }
}
