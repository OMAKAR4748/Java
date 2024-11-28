package com.xworkz.shop.store;

import com.xworkz.shop.Application.Application1DTO;
import java.util.Date;

public class StoreApplication1Save {
    private Application1DTO[] application1DTO = new Application1DTO[5];
    private int index;

    public String ApplicationDetailsSave(Application1DTO dto) {
        if (dto != null) {
            application1DTO[index] = dto;
            index++;
            return "Data is saved";
        } else {
            return "Data is not saved";
        }
    }

    public void read() {
        for (int i = 0; i < application1DTO.length; i++) {
            if (application1DTO[i] != null) {
                System.out.println(application1DTO[i]);
            }
        }
    }

    public void findApplicationDTOById(int id) {
        for (int i = 0; i < application1DTO.length; i++) {
            if (application1DTO[i] != null && application1DTO[i].getId() == id) {
                System.out.println(application1DTO[i]);
            }
        }
    }

    public void findApplicationByName(String name) {
        for (int i = 0; i < application1DTO.length; i++) {
            if (application1DTO[i] != null && application1DTO[i].getName().equals(name)) {
                System.out.println(application1DTO[i]);
            }
        }
    }

    public void findApplicationByVersion(float version) {
        for (int i = 0; i < application1DTO.length; i++) {
            if (application1DTO[i] != null && application1DTO[i].getVersion() == version) {
                System.out.println(application1DTO[i]);
            }
        }
    }


    public void updateApplicationDate(int id, Date newUpdatedDate) {
        for (int i = 0; i < application1DTO.length; i++) {
            if (application1DTO[i] != null && application1DTO[i].getId() == id) {
                application1DTO[i].setUpdatedDate(newUpdatedDate);
                System.out.println("Updated date for ID " + id + ": " + application1DTO[i]);
            }
        }
    }
}
