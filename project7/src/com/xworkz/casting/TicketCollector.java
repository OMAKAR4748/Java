package com.xworkz.casting;

public class TicketCollector extends PublicServant{
    public void checkTicket()
    {
        System.out.println("check ticket");
    }

    @Override
    public void protectIPC() {
        super.protectIPC();
    }

}
