package com.xworkz.Runner;

import com.xworkz.external.Som;
import com.xworkz.things.Cricket;
import com.xworkz.things.IplCricket;

public class CricketRunner {
    public static void main(String[] args) {
        Cricket cricket =new IplCricket();

        Som som=new Som();
        som.playingCricket(cricket);
    }
}
