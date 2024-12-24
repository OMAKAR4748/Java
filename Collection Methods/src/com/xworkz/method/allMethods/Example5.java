package com.xworkz.method.allMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class Example5 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Spring");
        collection.add("Summer");
        collection.add("Autumn");
        collection.add("Winter");

        String[] array = collection.toArray(new String[3]);

        System.out.println(Arrays.toString(array));
    }
}

