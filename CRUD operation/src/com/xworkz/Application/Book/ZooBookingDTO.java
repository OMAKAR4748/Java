package com.xworkz.Application.Book;

import java.io.Serializable;

public class ZooBookingDTO implements Serializable {
    private String customerName;
    private String email;
    private long mobile;
    private int noOfTickets;

    public ZooBookingDTO()
    {
        System.out.println("No-args const in ZooBookingDTO...");
    }

    public ZooBookingDTO(String customerName, long mobile, int noOfTickets)
    {

        this.customerName = customerName;
        this.mobile = mobile;
        this.noOfTickets = noOfTickets;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getMobile() {
        return mobile;
    }

    public int getNoOfTickets() {
        return noOfTickets;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public void setNoOfTickets(int noOfTickets) {
        this.noOfTickets = noOfTickets;
    }
}
