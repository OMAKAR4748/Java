package com.xworkz.Application.runner;

import com.xworkz.Application.Book.TicketBookingException;
import com.xworkz.Application.Book.ZooBook;
import com.xworkz.Application.Book.ZooBookingDTO;

public class ZooRunner {
    public static void main(String[] args)throws Exception {
        ZooBookingDTO zooBookingDTO =new ZooBookingDTO("omkar",9845454489L,2);

        ZooBook zooBook = new ZooBook();
        zooBook.byTicket(zooBookingDTO);

    }
}
