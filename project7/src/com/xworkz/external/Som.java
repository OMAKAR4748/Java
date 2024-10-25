package com.xworkz.external;

import com.xworkz.things.Cricket;
import com.xworkz.things.IplCricket;

public class Som {

    public void playingCricket(Cricket cricket)
    {
        System.out.println("Som playing cricket");
        cricket.schedule();
        cricket.agreement();

        if(cricket instanceof IplCricket)
        {
            IplCricket ipl = (IplCricket) cricket;
            ipl.prizeMoney();
        }
    }


}
