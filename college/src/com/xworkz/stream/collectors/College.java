package com.xworkz.stream.collectors;

import java.util.Objects;

public class College implements Comparable<College>{
    private String name;

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "College{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof College)) return false;
        College college = (College) o;
        return Objects.equals(name, college.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public int compareTo(College college2) {
        System.out.println("Running compareTo");
        return this.getName().compareTo(college2.getName());
    }

}
