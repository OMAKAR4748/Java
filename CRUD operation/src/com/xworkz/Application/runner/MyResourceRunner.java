package com.xworkz.Application.runner;

import com.xworkz.Application.internal.MyResource;

public class MyResourceRunner {
    public static void main(String[] args) {

        try (MyResource resource = new MyResource()) {
            resource.doSomething();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}

