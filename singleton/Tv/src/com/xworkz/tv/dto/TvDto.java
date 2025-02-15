package com.xworkz.tv.dto;


public class TvDto {
    private int speed;
    private boolean on;
    private String color;


    public TvDto(){
        System.out.println("Object created");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "TvDto{" +
                "speed=" + speed +
                ", on=" + on +
                ", color='" + color + '\'' +
                '}';
    }
}
