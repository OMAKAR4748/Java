package com.xworkz.map.dto;

import java.util.Objects;

public class MapDTO {
    private String personName;
    private long mobileNo;

    public MapDTO(String personName, long mobileNo) {
        this.personName = personName;
        this.mobileNo = mobileNo;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MapDTO)) return false;
        MapDTO mapDTO = (MapDTO) o;
        return mobileNo == mapDTO.mobileNo && Objects.equals(personName, mapDTO.personName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, mobileNo);
    }

    @Override
    public String toString() {
        return "MapDTO{" +
                "personName='" + personName + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
