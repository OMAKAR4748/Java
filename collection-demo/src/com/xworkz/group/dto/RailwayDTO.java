package com.xworkz.group.dto;

import java.time.LocalDate;
import java.util.Objects;

public class RailwayDTO {
    String name;
    int ticketNo;
    int ticketPrice;
    LocalDate date;

    public RailwayDTO(String name, int ticketNo, int ticketPrice, LocalDate date) {
        this.name = name;
        this.ticketNo = ticketNo;
        this.ticketPrice = ticketPrice;
        this.date = date;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof RailwayDTO) {
                RailwayDTO dto = (RailwayDTO) obj;
                if (dto.getName().equals("Ranni Channamma Express1") && dto.getTicketPrice() > 400) {
                    System.out.println("No any Train"+dto);
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, ticketNo, ticketPrice, date);
    }

    @Override
    public String toString() {
        return "RailwayDTO{" +
                "name='" + name + '\'' +
                ", ticketNo=" + ticketNo +
                ", ticketPrice=" + ticketPrice +
                ", date=" + date +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
