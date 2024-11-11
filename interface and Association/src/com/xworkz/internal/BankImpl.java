package com.xworkz.internal;

public class BankImpl implements BankRule{
    @Override
    public int openAccount() {
        System.out.println("Open Account");
        return 0;
    }

    @Override
    public void closeAccount() {
        System.out.println("Close Account");
    }
}
