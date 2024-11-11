package com.xworkz.internal;

public class Company {

    CompanyRule cr;
    public void checkHoliday(CompanyRule cr)
    {
        this.cr=cr;
        System.out.println("Check holiday in company");
    }
}
