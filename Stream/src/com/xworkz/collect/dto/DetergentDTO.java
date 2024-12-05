package com.xworkz.collect.dto;

import java.io.Serializable;
import java.util.Objects;

public class DetergentDTO implements Serializable, Comparable<DetergentDTO>{
    private double pricePerKg;
    private String brand;
    private int quantity;
    private double discount;
    private String soldBy;


    public DetergentDTO(double pricePerKg, String brand, int quantity, double discount, String soldBy) {
        this.pricePerKg = pricePerKg;
        this.brand = brand;
        this.quantity = quantity;
        this.discount = discount;
        this.soldBy = soldBy;
    }


    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    @Override
    public String toString() {
        return "DetergentDTO{" +
                "pricePerKg=" + pricePerKg +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", soldBy='" + soldBy + '\'' +
                '}';
    }

    @Override
    public int compareTo(DetergentDTO dto2) {
        System.out.println("Running compareTo");
        DetergentDTO dto1= this;
        return Double.compare(this.getPricePerKg(), dto2.getPricePerKg());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof DetergentDTO) {
                DetergentDTO dto = (DetergentDTO) obj;
                if (dto.getBrand().equals("Tide")) {
                    System.out.println(dto);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pricePerKg, brand, quantity, discount, soldBy);
    }
}
