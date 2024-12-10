package com.xworkz.stream.runner;

import com.xworkz.stream.collectors.Address;
import com.xworkz.stream.collectors.Person;

import java.util.*;
import java.util.stream.Collectors;

public class PersonRunner {
    public static void main(String[] args) {

        Address address1 = new Address("Rajaji Nagar", "6th Block", "Bangalore");
        Address address2 = new Address("Indira Nagar", "2nd Stage", "Mysore");
        Address address3 = new Address("Koramangala", "4th Block", "Hubbali");
        Address address4 = new Address("Jayanagar", "3rd Block", "Belagavi");
        Address address5 = new Address("Whitefield", "5th Block", "Pune");
        Address address6 = new Address("Malleswaram", "7th Cross", "Dilhi");
        Address address7 = new Address("HSR Layout", "Sector 1", "Channai");
        Address address8 = new Address("Basavanagudi", "DVG Road", "Goa");
        Address address9 = new Address("JP Nagar", "1st Phase", "Gadag");
        Address address10 = new Address("Banashankari", "2nd Stage", "Bengalore");


        Person person1 = new Person("Omkar Desai", "omkardesai771@gmail.com", "8296032460",address1);
        Person person2 = new Person("Aarav Kumar", "aaravkumar123@gmail.com", "9876543210",address2);
        Person person3 = new Person("Simran Singh", "simransingh456@gmail.com", "9123456780",address3);
        Person person4 = new Person("Riya Sharma", "riyasharma789@gmail.com", "9801234567",address4);
        Person person5 = new Person("Aman Gupta", "amangupta234@gmail.com", "9870123456",address5);
        Person person6 = new Person("Nisha Verma", "nishaverma567@gmail.com", "9123456789",address6);
        Person person7 = new Person("Vikram Patel", "vikrampatel890@gmail.com", "9801234561",address7);
        Person person8 = new Person("Sanya Mehta", "sanyamehta123@gmail.com", "9876543212",address8);
        Person person9 = new Person("Kunal Joshi", "kunaljoshi456@gmail.com", "9123456783",address9);
        Person person10 = new Person("Anjali Reddy", "anjalireddy789@gmail.com", "9801234564",address10);


        Collection<Person> collection = new ArrayList<>();
        collection.add(person1);
        collection.add(person2);
        collection.add(person3);
        collection.add(person4);
        collection.add(person5);
        collection.add(person6);
        collection.add(person7);
        collection.add(person8);
        collection.add(person9);
        collection.add(person10);


        //Find all person by name starting with S
        collection.stream()
                .filter(person -> person.getName().startsWith("S"))
                .forEach(person -> System.out.println(person));

        System.out.println("////////////////////////////////////////////////////////////////////");

        //Find all person by area **
        collection.stream().filter(person -> person.getAddress().getArea().equals("Bangalore"))
                .forEach(person -> System.out.println(person));

        System.out.println("////////////////////////////////////////////////////////////////////");

        //Sort all person by area
        collection.stream()
                .sorted(Comparator.comparing((Person person) -> person.getAddress().getArea()).reversed())
                .forEach(person -> System.out.println(person));


        System.out.println("////////////////////////////////////////////////////////////////////");

        //Filter by street
        collection.stream()
                .filter(person -> person.getAddress().getStreet().equals("Basavanagudi"))
                .forEach(person -> System.out.println(person));

        System.out.println("////////////////////////////////////////////////////////////////////");

        //Filter by email and street and area
        collection.stream()
                .filter(person -> person.getEmail().equals("omkardesai771@gmail.com") && person.getAddress().getStreet().equals("Rajaji Nagar") && person.getAddress().getArea().equals("Bangalore"))
                .forEach(person -> System.out.println(person));

        System.out.println("////////////////////////////////////////////////////////////////////");

        //Sort by name and area
         collection.stream()
                .sorted(Comparator.comparing(Person::getName)
                        .thenComparing(person -> person.getAddress().getArea().equals("Gadag")))
                        .forEach(person -> System.out.println(person));

        System.out.println("////////////////////////////////////////////////////////////////////");


        //Collect only area
        collection.stream()
                .map(person -> person.getAddress().getArea().equals("Bangalore"))
                .collect(Collectors.toList());

        System.out.println("////////////////////////////////////////////////////////////////////");


        //Collect only street
        collection.stream()
                .map(person -> person.getAddress().equals("Cherry St"))
                .collect(Collectors.toList());


    }
}



