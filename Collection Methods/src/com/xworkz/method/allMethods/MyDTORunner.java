package com.xworkz.method.allMethods;

import java.util.ArrayList;

public class MyDTORunner {
    public static void main(String[] args) {
        ArrayList<MyDTO> dtoList = new ArrayList<>();

        dtoList.add(new MyDTO(1, "Alice", "New York", 50000, "HR"));
        dtoList.add(new MyDTO(2, "Bob", "California", 55000, "IT"));
        dtoList.add(new MyDTO(3, "Charlie", "Texas", 60000, "Finance"));
        dtoList.add(new MyDTO(4, "David", "Florida", 45000, "Marketing"));
        dtoList.add(new MyDTO(5, "Eve", "Nevada", 70000, "IT"));

        System.out.println("Original List:");
        System.out.println(dtoList);

        // Add an element at a specific index
        dtoList.add(2, new MyDTO(6, "Frank", "Arizona", 48000, "HR"));
        System.out.println("\nAfter adding at index 2:");
        System.out.println(dtoList);

        // Get an element
        System.out.println("\nElement at index 3:");
        System.out.println(dtoList.get(3));

        // Set (replace) an element at a specific index
        dtoList.set(1, new MyDTO(7, "Grace", "Ohio", 52000, "IT"));
        System.out.println("\nAfter replacing element at index 1:");
        System.out.println(dtoList);

        // Check if the list contains a specific element
        System.out.println("\nContains check:");
        System.out.println(dtoList.contains(new MyDTO(3, "Charlie", "Texas", 60000, "Finance"))); // True
        System.out.println(dtoList.contains(new MyDTO(8, "Hannah", "Michigan", 58000, "Finance"))); // False

        // Remove an element by index
        dtoList.remove(0);
        System.out.println("\nAfter removing element at index 0:");
        System.out.println(dtoList);

        // Remove an element by object
        dtoList.remove(new MyDTO(5, "Eve", "Nevada", 70000, "IT"));
        System.out.println("\nAfter removing 'Eve' object:");
        System.out.println(dtoList);

        // Iterate using forEach
        System.out.println("\nUsing forEach:");
        dtoList.forEach(System.out::println);

        // Check the size of the list
        System.out.println("\nSize of the list:");
        System.out.println(dtoList.size());

        // Sort the list (custom sorting by salary)
        dtoList.sort((dto1, dto2) -> Double.compare(dto1.getSalary(), dto2.getSalary()));
        System.out.println("\nAfter sorting by salary:");
        dtoList.forEach(System.out::println);

        // Check if the list is empty
        System.out.println("\nIs list empty?");
        System.out.println(dtoList.isEmpty());

        // Convert to array
        Object[] dtoArray = dtoList.toArray();
        System.out.println("\nArray from ArrayList:");
        for (Object obj : dtoArray) {
            System.out.println(obj);
        }

        // Clear the list
        dtoList.clear();
        System.out.println("\nAfter clearing the list:");
        System.out.println("Is list empty? " + dtoList.isEmpty());
    }
}
