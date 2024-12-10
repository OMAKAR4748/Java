package com.xworkz.event.exceptional;

public class EventCreator extends Object{
    public void DataChecked()throws DataException
    {
        throw new DataException();
    }
    public void LogicUnChecked()
    {
        throw new LogicException();
    }
}
