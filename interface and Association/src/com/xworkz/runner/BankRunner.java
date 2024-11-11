package com.xworkz.runner;

import com.xworkz.internal.Bank;
import com.xworkz.internal.BankImpl;
import com.xworkz.internal.BankRule;

public class BankRunner {
    public static void main(String[] args) {
        BankRule bankRule = new BankImpl();
        bankRule.openAccount();
        bankRule.closeAccount();

        System.out.println("==========================================");

        Bank bank = new Bank();
        bank.openSavingAccount();
        bank.closeSavingAccount();
    }

}
