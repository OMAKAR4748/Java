package com.xworkz.internal;

public class CompanyRuleImpl implements CompanyRule{
    @Override
    public boolean holiday() {
        System.out.println("Holiday in company");
        return false;
    }
}
