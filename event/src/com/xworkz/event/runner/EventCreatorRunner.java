package com.xworkz.event.runner;

import com.xworkz.event.exceptional.DataException;
import com.xworkz.event.exceptional.EventCreator;
import com.xworkz.event.exceptional.StackCreator;

import static java.lang.Thread.sleep;


public class EventCreatorRunner {
    public static void main(String[] args) throws DataException,IllegalAccessException{
//        EventCreator eventCreator = new EventCreator();
//        eventCreator.DataChecked();
//        eventCreator.LogicUnChecked();

        StackCreator stackCreator = new StackCreator();
        stackCreator.frame1();
        stackCreator.frame2();
        stackCreator.frame3();
        stackCreator.frame4();
        stackCreator.frame5();

    }
}
