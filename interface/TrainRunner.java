package com.xworkz.Runner;

import com.xworkz.interfaces.Train;
import com.xworkz.interfaces.TrainImpl;

public class TrainRunner {
    public static void main(String[] args) {
        Train train = new TrainImpl();
        train.dateTime();
        train.ticketNumber();
        train.source();
        train.destination();
        train.speed();
    }
}
