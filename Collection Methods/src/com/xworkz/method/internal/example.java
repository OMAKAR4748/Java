package com.xworkz.method.internal;

import java.util.ArrayList;
import java.util.List;

public class example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

          list.add("Monday");
          list.add("Tuesday");
          list.add("Wednesday");
          list.add("Thursday");
          list.add("Friday");

          List<String> midWeek = list.subList(2, 4);
          System.out.println(midWeek);
    }

}
