package com.xworkz.stream.runner;

import com.xworkz.stream.collectors.College;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CollegeRunner {
    public static void main(String[] args) {
        College college1 = new College("Angadi College");
        College college2 = new College("Baldwin College");
        College college3 = new College("Christ College");
        College college4 = new College("Dayananda Sagar College");
        College college5 = new College("East Point College");
        College college6 = new College("Garden City College");
        College college7 = new College("HKBK College");
        College college8 = new College("Indian Institute of Science");
        College college9 = new College("Jain College");
        College college10 = new College("Kristu Jayanti College");
        College college11 = new College("Mount Carmel College");
        College college12 = new College("National College");
        College college13 = new College("Oxford College");
        College college14 = new College("Presidency College");
        College college15 = new College("Ramaiah College");
        College college16 = new College("St. Joseph's College");
        College college17 = new College("T. John College");
        College college18 = new College("University Visvesvaraya College of Engineering");
        College college19 = new College("Vijaya College");
        College college20 = new College("Vydehi College");


        Collection<College> collection = new ArrayList<>();
        collection.add(college1);
        collection.add(college2);
        collection.add(college3);
        collection.add(college4);
        collection.add(college5);
        collection.add(college6);
        collection.add(college7);
        collection.add(college8);
        collection.add(college9);
        collection.add(college10);
        collection.add(college11);
        collection.add(college12);
        collection.add(college13);
        collection.add(college14);
        collection.add(college15);
        collection.add(college16);
        collection.add(college17);
        collection.add(college18);
        collection.add(college19);
        collection.add(college20);

        //Filter all college starting with 'A'
        collection.stream()
                .filter(colleges -> colleges.getName().startsWith("A"))
                .collect(Collectors.toList())
                .forEach(college -> System.out.println(college));

        System.out.println("////////////////////////////////////////////////////////////////////");


        //Convert all college names to upper case
        collection.stream()
                .map(college -> college.getName().toUpperCase())
                .collect(Collectors.toList())
                .forEach(college -> System.out.println(college));

        System.out.println("////////////////////////////////////////////////////////////////////");

        //Convert all college names to lower case
        collection.stream()
                .map(college -> college.getName().toLowerCase())
                .collect(Collectors.toList())
                .forEach(college -> System.out.println(college));

        System.out.println("////////////////////////////////////////////////////////////////////");

        //sort all college names in desc order
        collection.stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toList()).forEach(college -> System.out.println(college));


    }
}
