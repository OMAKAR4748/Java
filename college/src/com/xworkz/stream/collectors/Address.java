package com.xworkz.stream.collectors;

import java.util.Objects;

public class Address {
    private String street;
    private String no;
    private String area;

    public Address(String street, String no, String area) {
        this.street = street;
        this.no = no;
        this.area = area;
    }
    @Override
    public String toString() {
        return "Address{street='" + street + "', no='" + no + "', area='" + area + "'}";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return Objects.equals(street, address.street) && Objects.equals(no, address.no) && Objects.equals(area, address.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, no, area);
    }
}
