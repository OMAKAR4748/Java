package com.xworkz.method.allMethods;

import java.util.ArrayList;
import java.util.Collection;

public class Example4 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Book");
        collection.add("Pen");
        collection.add("Notebook");

        Collection<String> stationery = new ArrayList<>();
        stationery.add("Pen");
        stationery.add("Notebook");

        collection.retainAll(stationery);
        System.out.println(collection);

        for (String item : collection) {
            System.out.println(item);
        }
    }
}

