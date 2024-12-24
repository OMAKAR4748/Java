package com.xworkz.method.allMethods;
import java.util.Objects;

public class MyDTO {
    private int id;
    private String name;
    private String address;
    private double salary;
    private String department;

    public MyDTO(int id, String name, String address, double salary, String department) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString for printing DTO
    @Override
    public String toString() {
        return "MyDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDTO myDTO = (MyDTO) o;
        return id == myDTO.id && Double.compare(myDTO.salary, salary) == 0 && Objects.equals(name, myDTO.name) && Objects.equals(address, myDTO.address) && Objects.equals(department, myDTO.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, salary, department);
    }
}

