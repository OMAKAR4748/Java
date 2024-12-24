package com.xworkz.method.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class NumbersRunner {
    public static void main(String[] args) {
        List<NumbersDTO> collection = new ArrayList<>();
        NumbersDTO number = new NumbersDTO("number");

        collection.add(number);


        List<NumbersDTO> moreNumbers = new ArrayList<>();
        moreNumbers.add(new NumbersDTO("number1"));
        moreNumbers.add(new NumbersDTO("number2"));
        moreNumbers.add(new NumbersDTO("number3"));
        collection.addAll(1,moreNumbers);

        System.out.println(collection);


    }
}
