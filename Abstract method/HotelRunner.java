package com.xworkz.Runner;

import com.xworkz.Abstraction.AshokaHotel;
import com.xworkz.Abstraction.Hotel;
import com.xworkz.Abstraction.LeelaHotel;

public class HotelRunner {
    public static void main(String[] args) {
        Hotel hotel = new LeelaHotel();
        hotel.portableRoom();
        hotel.advanceBooking();
        hotel.service();
        hotel.toString();

        System.out.println("===================================");

        Hotel hotel1 = new AshokaHotel();
        hotel1.portableRoom();
        hotel1.advanceBooking();
        hotel1.service();
        hotel1.toString();
    }
}
