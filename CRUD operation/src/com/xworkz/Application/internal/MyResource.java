package com.xworkz.Application.internal;


public class MyResource implements AutoCloseable {

    public MyResource() {
            System.out.println("Resource initialized");
        }


    public void doSomething() {
            System.out.println("Doing something with the resource");
        }

        @Override
        public void close() {
            System.out.println("Resource closed");
        }

}
