package com.xworkz.shop.store;

import com.xworkz.shop.Application.ApplicationDTO;

public class StoreApplicationSave {
    ApplicationDTO applicationDTO[] = new ApplicationDTO[5];
    int index;

    public String ApplicationDetailsSave(ApplicationDTO dto) {
        if (dto != null) {
            applicationDTO[index] = dto;
            index++;
            return "Data is saved";
        } else {
            return "Data is not saved";
        }
    }

    public void read() {
        for (int i = 0; i < applicationDTO.length; i++) {
            System.out.println(applicationDTO[i]);
        }

//            for (ApplicationDTO dto:applicationDTO)  //another method
//            {
//                System.out.println(dto);
//            }
    }

    public void findApplicationDTOById(int id)
    {
        for (int i=0;i<applicationDTO.length;i++)
        {
            if (applicationDTO[i].getId()==id)
            {
                System.out.println(applicationDTO[i]);
            }
        }
    }
    public void findApplicationByName(String name)
    {
        for (int i=0;i<applicationDTO.length;i++)
        {
            if (applicationDTO[i].getName().equals(name))
            {
                System.out.println(applicationDTO[i]);
            }
        }
    }
    public void findApplicationByVersion(float version)
    {
        for (int i=0;i<applicationDTO.length;i++)
        {
            if (applicationDTO[i].getVersion()==version)
            {
                System.out.println(applicationDTO[i]);
            }
        }
    }

}
