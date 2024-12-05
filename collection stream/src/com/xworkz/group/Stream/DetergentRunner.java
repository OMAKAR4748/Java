package com.xworkz.group.Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class DetergentRunner {
    public static void main(String[] args) {
       DetergentDTO detergentDTO;

        Collection<DetergentDTO> collection = new ArrayList<>();
        collection.add(new DetergentDTO(120.0, "Tide", 2, 10.0, "SuperMart"));
        collection.add(new DetergentDTO(95.0, "Surf Excel", 1, 5.0, "MegaStore"));
        collection.add(new DetergentDTO(85.0, "Ariel", 3, 15.0, "QuickShop"));
        collection.add(new DetergentDTO(70.0, "Rin", 5, 8.0, "DailyMart"));
        collection.add(new DetergentDTO(50.0, "Wheel", 4, 12.0, "SuperBazaar"));
        collection.add(new DetergentDTO(110.0, "Henko", 1, 7.0, "ValueStore"));
        collection.add(new DetergentDTO(130.0, "Ghadi", 2, 9.0, "BigMall"));
        collection.add(new DetergentDTO(65.0, "Nirma", 6, 10.0, "LocalMart"));
        collection.add(new DetergentDTO(125.0, "Surf Excel Matic", 1, 5.0, "OnlineStore"));
        collection.add( new DetergentDTO(140.0, "Tide Plus", 3, 20.0, "DiscountBazaar"));

        collection.stream()
                .filter(dto -> dto.getPricePerKg() < 100)
                .collect(Collectors.toList())
                .forEach(dto -> System.out.println(dto));

        System.out.println("===================================================================================");

        collection.stream()
                .filter(dto -> dto.getQuantity() < 5)
                .collect(Collectors.toList())
                .forEach(dto -> System.out.println(dto));

        System.out.println("===================================================================================");

        collection.stream()
                .filter(dto -> dto.getDiscount() < 10 && dto.getBrand().equals("Surf Excel"))
                .collect(Collectors.toList())
                .forEach(dto -> System.out.println(dto));

        System.out.println("===================================================================================");

        collection.stream()
                .filter(dto -> dto.getSoldBy().equals("DailyMart") && dto.getBrand().equals("Rin") && dto.getQuantity() == 5)
                .collect(Collectors.toList())
                .forEach(dto -> System.out.println(dto));

        System.out.println("===================================================================================");

        collection.stream()
                .sorted((dto1,dto2) -> Integer.compare(dto1.getPricePerKg(),dto2.getPricePerKg()))
                .forEach((dto2,dto1) -> System.out.println(dto1,dto2));
    }
}
