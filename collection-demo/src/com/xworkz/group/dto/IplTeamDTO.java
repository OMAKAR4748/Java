package com.xworkz.group.dto;

import java.io.Serializable;

public class IplTeamDTO implements Serializable {
   private String name;
   private int noOfPlayers;
   private String onwerName;
   private String SponserName;
   private double budget;

   public IplTeamDTO()
   {

   }

    public IplTeamDTO(String name, int noOfPlayers, String onwerName, String sponserName, double budget)
    {
        this.name = name;
        this.noOfPlayers = noOfPlayers;
        this.onwerName = onwerName;
        SponserName = sponserName;
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "IplTeamDTO{" +
                "name='" + name + '\'' +
                ", noOfPlayers=" + noOfPlayers +
                ", onwerName='" + onwerName + '\'' +
                ", SponserName='" + SponserName + '\'' +
                ", budget=" + budget +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getOnwerName() {
        return onwerName;
    }

    public void setOnwerName(String onwerName) {
        this.onwerName = onwerName;
    }

    public String getSponserName() {
        return SponserName;
    }

    public void setSponserName(String sponserName) {
        SponserName = sponserName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;

    }
}
