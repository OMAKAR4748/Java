package com.xworkz.runner;

import com.xworkz.internal.Company;
import com.xworkz.internal.CompanyRule;
import com.xworkz.internal.CompanyRuleImpl;

public class CompanyRunner {
    public static void main(String[] args) {
        CompanyRule companyRule =new CompanyRuleImpl();
        companyRule.holiday();

        Company company =new Company();
        company.checkHoliday(companyRule);
    }
}

