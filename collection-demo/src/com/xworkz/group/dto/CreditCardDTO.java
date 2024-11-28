package com.xworkz.group.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class CreditCardDTO implements Serializable {
    private String type;
    private String no;
    private LocalDate expiryDate;
    private int cvv;

    public CreditCardDTO()
    {

    }

    public CreditCardDTO(String type, String no, LocalDate expiryDate, int cvv) {
        this.type = type;
        this.no = no;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCardDTO{" +
                "type='" + type + '\'' +
                ", no=" + no +
                ", expiryDate=" + expiryDate +
                ", cvv=" + cvv +
                '}';
    }
}
