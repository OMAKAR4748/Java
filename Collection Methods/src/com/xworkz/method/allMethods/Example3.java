package com.xworkz.method.allMethods;

import java.util.HashSet;
import java.util.Collection;

public class Example3 {
    public static void main(String[] args) {
        Collection<String> collection = new HashSet<>();
        collection.add("Laptop");
        collection.add("Smartphone");
        collection.add("Tablet");

        boolean Laptop = collection.contains("Laptop");
        System.out.println("Contains Laptop: " + Laptop);

        Collection<String> gadgets = new HashSet<>();
        gadgets.add("Smartphone");
        gadgets.add("Tablet");
        boolean AllGadgets = collection.containsAll(gadgets);
        System.out.println("Contains all gadgets: " + AllGadgets);
    }
}
