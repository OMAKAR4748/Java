package com.xworkz.group.dto;

import java.io.Serializable;

public class ApplicationDTO implements Serializable {
    private int id;
    private String name;
    private String type;
    private String version;
    private int size;
    private String companyName;

    public ApplicationDTO()
    {

    }

    public ApplicationDTO(int id, String name, String type, String version, int size, String companyName) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.version = version;
        this.size = size;
        this.companyName = companyName;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "ApplicationDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", size=" + size +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
