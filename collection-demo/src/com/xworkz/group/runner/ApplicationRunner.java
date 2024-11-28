package com.xworkz.group.runner;

import com.xworkz.group.dto.ApplicationDTO;

import java.util.ArrayList;
import java.util.Collection;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationDTO applicationDTO1 = new ApplicationDTO(20, "Forum Software", "Web", "2.3", 105, "Community Connect");
        ApplicationDTO applicationDTO2 = new ApplicationDTO(1, "Expense Tracker", "Mobile", "1.0", 50, "Fintech Corp");
        ApplicationDTO applicationDTO3 = new ApplicationDTO(2, "E-Commerce Platform", "Web", "1.1", 60, "Retail Innovations");
        ApplicationDTO applicationDTO4 = new ApplicationDTO(3, "Project Management Tool", "Desktop", "2.0", 120, "Productivity Solutions");
        ApplicationDTO applicationDTO5 = new ApplicationDTO(4, "Fitness App", "Mobile", "1.2", 75, "HealthTech");
        ApplicationDTO applicationDTO6 = new ApplicationDTO(5, "Social Media Dashboard", "Web", "2.1", 100, "Digital Connect");
        ApplicationDTO applicationDTO7 = new ApplicationDTO(6, "Graphic Design Software", "Desktop", "3.0", 200, "Creative Works");
        ApplicationDTO applicationDTO8 = new ApplicationDTO(7, "Recipe Finder", "Mobile", "2.0", 90, "Culinary Creations");
        ApplicationDTO applicationDTO9 = new ApplicationDTO(8, "Online Learning Platform", "Web", "1.3", 80, "EduTech");
        ApplicationDTO applicationDTO10 = new ApplicationDTO(9, "Data Analytics Tool", "Desktop", "2.1", 110, "Analytics Pro");
        ApplicationDTO applicationDTO11 = new ApplicationDTO(10, "Travel Planner", "Mobile", "1.5", 60, "TravelGo");
        ApplicationDTO applicationDTO12 = new ApplicationDTO(11, "Customer Relationship Management", "Web", "1.6", 70, "ClientFirst");
        ApplicationDTO applicationDTO13 = new ApplicationDTO(12, "Inventory Management System", "Desktop", "3.1", 150, "BusinessWare");
        ApplicationDTO applicationDTO14 = new ApplicationDTO(13, "Meditation App", "Mobile", "1.7", 65, "Mindful Living");
        ApplicationDTO applicationDTO15 = new ApplicationDTO(14, "Blogging Platform", "Web", "2.0", 90, "Content Creators");
        ApplicationDTO applicationDTO16 = new ApplicationDTO(15, "Video Editing Software", "Desktop", "2.5", 130, "MediaWorks");
        ApplicationDTO applicationDTO17 = new ApplicationDTO(16, "Weather Forecast App", "Mobile", "1.9", 85, "WeatherNow");
        ApplicationDTO applicationDTO18 = new ApplicationDTO(17, "Job Portal", "Web", "2.2", 95, "CareerBuilder");
        ApplicationDTO applicationDTO19 = new ApplicationDTO(18, "Accounting Software", "Desktop", "3.2", 160, "Finance Pro");
        ApplicationDTO applicationDTO20 = new ApplicationDTO(19, "Event Management App", "Mobile", "2.1", 70, "EventEase");

        Collection<ApplicationDTO> collection = new ArrayList<>();
        collection.add(applicationDTO1);
        collection.add(applicationDTO2);
        collection.add(applicationDTO3);
        collection.add(applicationDTO4);
        collection.add(applicationDTO5);
        collection.add(applicationDTO6);
        collection.add(applicationDTO7);
        collection.add(applicationDTO8);
        collection.add(applicationDTO9);
        collection.add(applicationDTO10);
        collection.add(applicationDTO11);
        collection.add(applicationDTO12);
        collection.add(applicationDTO13);
        collection.add(applicationDTO14);
        collection.add(applicationDTO15);
        collection.add(applicationDTO16);
        collection.add(applicationDTO17);
        collection.add(applicationDTO18);
        collection.add(applicationDTO19);
        collection.add(applicationDTO20);

        for (ApplicationDTO dto:collection)
        {
            System.out.println("Name: " +dto.getName());
            System.out.println("Company Name: " +dto.getCompanyName());
        }

        System.out.println("============================================================================================");

        for (ApplicationDTO dto:collection)
        {
            System.out.println("Name: " +dto.getName());
            System.out.println("Version: " +dto.getVersion());
            System.out.println("Size: " +dto.getSize());
        }

        System.out.println("============================================================================================");

        for (ApplicationDTO dto:collection)
        {
            if (dto.getType().equals("Web"))
            {
                System.out.println("Application Type:"+dto);
            }

        }

    }
}
//print name and companyName
//print name and version and size
//find all by type
