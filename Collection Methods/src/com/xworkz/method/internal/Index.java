package com.xworkz.method.internal;

import java.util.ArrayList;
import java.util.List;

public class Index{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");

        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);

        int firstIndex = list.indexOf("Apple");
        System.out.println("First index of 'Apple': " + firstIndex);

        int lastIndex = list.lastIndexOf("Apple");
        System.out.println("Last index of 'Apple': " + lastIndex);
    }
}

