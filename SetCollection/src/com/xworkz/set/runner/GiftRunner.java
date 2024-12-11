package com.xworkz.set.runner;

import com.xworkz.set.internal.GiftDTO;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GiftRunner {
    public static void main(String[] args) {
        GiftDTO giftDTO1 = new GiftDTO(1, "Watch", 2500.00, "Alice", "Bob");
        GiftDTO giftDTO2 = new GiftDTO(2, "Laptop", 55000.00, "Charlie", "Dave");
        GiftDTO giftDTO3 = new GiftDTO(3, "Book", 500.00, "Eve", "Frank");
        GiftDTO giftDTO4 = new GiftDTO(4, "Smartphone", 15000.00, "Grace", "Heidi");
        GiftDTO giftDTO5 = new GiftDTO(5, "Headphones", 3000.00, "Ivan", "Judy");
        GiftDTO giftDTO6 = new GiftDTO(3, "Book", 500.00, "Eve", "Frank");
        GiftDTO giftDTO7 = new GiftDTO(7, "Bike", 70000.00, "Oscar", "Peggy");
        GiftDTO giftDTO8 = new GiftDTO(8, "Camera", 25000.00, "Quentin", "Ralph");
        GiftDTO giftDTO9 = new GiftDTO(9, "Tablet", 20000.00, "Sybil", "Trent");
        GiftDTO giftDTO10 = new GiftDTO(1, "Watch", 2500.00, "Alice", "Bob");

        Set<GiftDTO> set = new HashSet<>();
        set.add(giftDTO1);
        set.add(giftDTO2);
        set.add(giftDTO3);
        set.add(giftDTO4);
        set.add(giftDTO5);
        set.add(giftDTO6);
        set.add(giftDTO7);
        set.add(giftDTO8);
        set.add(giftDTO9);
        set.add(giftDTO10);

        System.out.println("Number of unique gifts in set: " + set.size());

        System.out.println("====================================================");

        System.out.println("cost in descending order:...");
        set.stream().sorted(Comparator.comparingDouble(GiftDTO::getCost)).forEach(System.out::println);

        System.out.println("===================================================");

        System.out.println("Getting the names and from  in Ascending order....");
        set.stream()
                .sorted(Comparator.comparing(GiftDTO::getName)
                        .thenComparing(GiftDTO::getFrom))
                .forEach(System.out::println);

        System.out.println("===================================================");

        System.out.println("Getting only the Id's:");
        set.stream().map(GiftDTO::getId).forEach(System.out::println);

        System.out.println("===================================================");

        System.out.println("Get only From and sort on desc order..");
        set.stream().map(GiftDTO::getFrom).sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
