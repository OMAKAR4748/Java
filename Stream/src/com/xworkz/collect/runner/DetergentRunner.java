package com.xworkz.collect.runner;

import com.xworkz.collect.dto.DetergentDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class DetergentRunner {
    public static void main(String[] args) {

        DetergentDTO dto1 = new DetergentDTO(120.0, "Tide", 2, 10.0, "SuperMart");
        DetergentDTO dto2 = new DetergentDTO(95.0, "Surf Excel", 1, 5.0, "MegaStore");
        DetergentDTO dto3 = new DetergentDTO(85.0, "Ariel", 3, 15.0, "QuickShop");
        DetergentDTO dto4 = new DetergentDTO(70.0, "Rin", 5, 8.0, "DailyMart");
        DetergentDTO dto5 = new DetergentDTO(50.0, "Wheel", 4, 12.0, "SuperBazaar");
        DetergentDTO dto6 = new DetergentDTO(110.0, "Henko", 1, 7.0, "ValueStore");
        DetergentDTO dto7 = new DetergentDTO(130.0, "Ghadi", 2, 9.0, "BigMall");
        DetergentDTO dto8 = new DetergentDTO(65.0, "Nirma", 6, 10.0, "LocalMart");
        DetergentDTO dto9 = new DetergentDTO(125.0, "Surf Excel Matic", 1, 5.0, "OnlineStore");
        DetergentDTO dto10 = new DetergentDTO(140.0, "Tide Plus", 3, 20.0, "DiscountBazaar");



        Collection<DetergentDTO> collection = new ArrayList<>();
        collection.add(dto1);
        collection.add(dto2);
        collection.add(dto3);
        collection.add(dto4);
        collection.add(dto5);
        collection.add(dto6);
        collection.add(dto7);
        collection.add(dto8);
        collection.add(dto9);
        collection.add(dto10);


        //  Filter by pricePerKg < 100
        collection.stream()
                .filter(d -> d.getPricePerKg() < 100)
                .collect(Collectors.toList())
                .forEach(detergentDTO -> System.out.println(detergentDTO));

        System.out.println("///////////////////////////////////////////////////////////////////////////////////");

        //  Filter by quantity < 5
        collection.stream()
                .filter(d -> d.getQuantity() < 5)
                .collect(Collectors.toList())
                .forEach(detergentDTO -> System.out.println(detergentDTO));

        System.out.println("///////////////////////////////////////////////////////////////////////////////////");

        //  Filter by discount and brand
        collection.stream()
                .filter(d -> d.getDiscount() < 10 && d.getBrand().equals("Surf Excel"))
                .collect(Collectors.toList())
                .forEach(detergentDTO -> System.out.println(detergentDTO));

        System.out.println("///////////////////////////////////////////////////////////////////////////////////");

        // Filter by soldBy and brand  and quantity
        collection.stream()
                .filter(d ->d.getSoldBy().equals("DailyMart") && d.getBrand().equals("Rin") && d.getQuantity() >2)
                .collect(Collectors.toList())
                .forEach(detergentDTO -> System.out.println(detergentDTO));

        System.out.println("///////////////////////////////////////////////////////////////////////////////////");

        // Sort by pricePerKg in descending order
        collection.stream()
                .sorted((d1, d2) -> Double.compare(d2.getPricePerKg(), d1.getPricePerKg()))
                .collect(Collectors.toList())
                .forEach(detergentDTO -> System.out.println(detergentDTO));

    }

}

