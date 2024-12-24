package com.xworkz.method.internal;

import java.io.Serializable;
import java.util.Objects;

public class NumbersDTO implements Serializable {
    private String number;

    public NumbersDTO(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumbersDTO{" +
                "number='" + number + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NumbersDTO)) return false;
        NumbersDTO that = (NumbersDTO) o;
        return Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }
}
