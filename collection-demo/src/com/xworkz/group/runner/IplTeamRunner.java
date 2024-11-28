package com.xworkz.group.runner;

import com.xworkz.group.dto.IplTeamDTO;

import java.util.ArrayList;
import java.util.Collection;

public class IplTeamRunner {
    public static void main(String[] args) {
        IplTeamDTO iplTeamDTO1 =new IplTeamDTO("CSK",25,"N. Srinivasan","TVS Eurogrip",55);
        IplTeamDTO iplTeamDTO2 =new IplTeamDTO("RCB",22,"United Spirits","Qatar Airways",83);
        IplTeamDTO iplTeamDTO3 =new IplTeamDTO("MI",23,"Mukesh Ambani","Dream11",45);
        IplTeamDTO iplTeamDTO4 =new IplTeamDTO("DC",23,"Kiran Kumar Grandhi ","Fan Craze",73);
        IplTeamDTO iplTeamDTO5 =new IplTeamDTO("SRH",20,"Kavya Kalanithi Maran","Jio",45);
        IplTeamDTO iplTeamDTO6 =new IplTeamDTO("GT",25,"CVC Capital Partners","ACKO",69);
        IplTeamDTO iplTeamDTO7 =new IplTeamDTO("LSG",24,"Sanjiv Goenka","Reliance Jio Infocomm Ltd",69);
        IplTeamDTO iplTeamDTO8 =new IplTeamDTO("RR",20,"Manoj Badale","Dollar",41);
        IplTeamDTO iplTeamDTO9 =new IplTeamDTO("PBKS",25,"Preity Zinta","BKT Tyres",110);
        IplTeamDTO iplTeamDTO10 =new IplTeamDTO("KKR",21,"Shah Rukh Khan","Thumbs Up",51);

        Collection<IplTeamDTO> collection = new ArrayList<>();

        collection.add(iplTeamDTO1);
        collection.add(iplTeamDTO2);
        collection.add(iplTeamDTO3);
        collection.add(iplTeamDTO4);
        collection.add(iplTeamDTO5);
        collection.add(iplTeamDTO6);
        collection.add(iplTeamDTO7);
        collection.add(iplTeamDTO8);
        collection.add(iplTeamDTO9);
        collection.add(iplTeamDTO10);



        for(IplTeamDTO dto:collection)
        {
            if (dto.getName().equals("CSK"))
            {
                System.out.println("Team Name:" + dto.getName());
            }
        }

        System.out.println("==========================");


        for (IplTeamDTO dto:collection)
        {
            if (dto.getBudget() > 50) {
                System.out.println("Team Budget:" + dto.getBudget());
            }
        }

        System.out.println("==========================");


        for (IplTeamDTO dto:collection)
        {
            if(dto.getOnwerName().equals("CVC Capital Partners") && dto.getSponserName().equals("ACKO"))
            {
                System.out.println("Team OwnerName and SponsorName:" +dto);
            }
        }

        System.out.println("==========================");

        for (IplTeamDTO dto:collection)
        {
            if (dto.getSponserName().equals("Jio"))
            {
                System.out.println("Team SponsorName:" + dto.getSponserName());
            }
        }

        System.out.println("==========================");

        for (IplTeamDTO dto:collection)
        {
            if (dto.getNoOfPlayers()>24)
            {
                System.out.println("Team Size:" + dto.getNoOfPlayers());
            }
        }

        System.out.println("==========================");

        for (IplTeamDTO dto:collection)
        {
            System.out.println("Team Name:" +dto.getName());
            System.out.println("Team Size:" +dto.getNoOfPlayers());
        }

        System.out.println("==========================");

        for (IplTeamDTO dto:collection)
        {
            System.out.println("Team Name:" +dto.getName());
            System.out.println("Team Budget:" +dto.getBudget());
        }

        System.out.println("==========================");



    }
}

//print all name
//find all iplDto By Budget
//find all iplDto by sponsorName
//find all iplDto by ownerName and sponsorName
//find all iplDto by teamSize
//print name and teamSize
//print name and budget
