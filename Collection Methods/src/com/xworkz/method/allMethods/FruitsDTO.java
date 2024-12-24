package com.xworkz.method.allMethods;

import java.util.Objects;

public class FruitsDTO {
    private String name;
    private int price;
    private int quantity;

    public FruitsDTO(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FruitsDTO)) return false;
        FruitsDTO fruitsDTO = (FruitsDTO) o;
        return price == fruitsDTO.price && quantity == fruitsDTO.quantity && Objects.equals(name, fruitsDTO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, quantity);
    }

    @Override
    public String toString() {
        return "FruitsDTO{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
