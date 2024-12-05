package com.xworkz.group.Imple;

import java.util.ArrayList;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop;
        shop=(a,b)-> a+b;
        int res =shop.open(6,5);
        System.out.println(res);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(9);
        Integer size = arrayList.size();
        System.out.println(size);

        for (Integer i:arrayList)
        {
            System.out.println(i);
        }
        arrayList.forEach(a-> System.out.println(a));


    }

}
