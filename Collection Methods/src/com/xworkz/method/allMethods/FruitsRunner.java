package com.xworkz.method.allMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class FruitsRunner {
    public static void main(String[] args) {
        FruitsDTO fruitsDTO = new FruitsDTO("Mango",100,2);
        FruitsDTO fruitsDTO1 =new FruitsDTO("Banana",120,3);
        FruitsDTO fruitsDTO2= new FruitsDTO("Grapes",70,1);
        FruitsDTO fruitsDTO3 = new FruitsDTO("Apple",400,2);

        Collection<FruitsDTO> collection = new ArrayList<>();
        collection.add(fruitsDTO);
        collection.add(fruitsDTO1);

        Collection<FruitsDTO> fruits = new ArrayList<>();
        fruits.add(fruitsDTO2);
        fruits.add(fruitsDTO3);
        collection.addAll(fruits);

        Iterator<FruitsDTO> iterator = collection.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}

