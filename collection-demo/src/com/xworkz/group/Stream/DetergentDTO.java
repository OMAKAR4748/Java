package com.xworkz.group.Stream;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;


public class DetergentDTO implements Serializable,Comparable<DetergentDTO> {
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
    public int compareTo(DetergentDTO dto) {
        System.out.println("Running compareTo");
//        if (dto.getPricePerKg() < dto.getPricePerKg()) {
//            return -1;
//        }
//        if (dto.getPricePerKg() == dto.getPricePerKg()) {
//            return 0;
//        }
//        if (dto.getPricePerKg() > dto.getPricePerKg()) {
//            return 1;
//        }
//        return 0;
    return Integer.compare(dto.getPricePerKg(),dto.getPricePerKg());
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
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof DetergentDTO) {
                DetergentDTO casted = (DetergentDTO) obj;
                if (casted.equals("Tide") == casted.equals("Rin")) {
                    System.out.println(casted);
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
