package com.xworkz.Abstraction;

public abstract class Web {
    String version;
    Web()
    {
        super();
    }
    Web(String version)
    {
        this.version=version;
    }
    public abstract void autoConnect();

    @Override
    public String toString() {
        return super.toString();
    }
}
