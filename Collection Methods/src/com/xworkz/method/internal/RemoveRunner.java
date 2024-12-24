package com.xworkz.method.internal;

import java.util.ArrayList;
import java.util.List;

public class RemoveRunner {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.remove(1);

         list.set(1, "Yellow");
         System.out.println(list);
    }
}
