package com.xworkz.Application.Book;


public class ZooBook extends ZooBookingDTO{


    public void byTicket(ZooBookingDTO zooBookingDTO)throws Exception
    {
        String customerName = getCustomerName();
        String email = getEmail();
        long mobile =getMobile();
        int noOfTickets = getNoOfTickets();


        if (customerName == null || customerName.length()<4 || noOfTickets<1 )
        {
            System.out.println("Invalid booking information...");

        }
        else {
            System.out.println("Valid booking information...");
        }
    }
}
