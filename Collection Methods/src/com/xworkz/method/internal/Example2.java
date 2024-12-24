package com.xworkz.method.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String letter = iterator.next();
            System.out.println(letter);
            iterator.remove();
        }

        while (iterator.hasPrevious()) {
            String letter = iterator.previous();
            System.out.println(letter);
        }
    }
}

