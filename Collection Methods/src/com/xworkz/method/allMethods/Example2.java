package com.xworkz.method.allMethods;

import java.util.ArrayList;
import java.util.Collection;

public class Example2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Eagle");
        collection.add("Falcon");
        collection.add("Hawk");

        collection.remove("Falcon");
        System.out.println(collection);

        Collection<String> birds = new ArrayList<>();
        birds.add("Eagle");
        collection.removeAll(birds);
        System.out.println(collection);

        collection.clear();

        System.out.println("Is the collection empty? " + collection.isEmpty());
    }
}
