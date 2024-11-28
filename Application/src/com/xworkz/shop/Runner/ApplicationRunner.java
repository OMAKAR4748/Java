package com.xworkz.shop.Runner;

import com.xworkz.shop.Application.ApplicationDTO;
import com.xworkz.shop.store.StoreApplicationSave;

public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationDTO applicationDTO = new ApplicationDTO();
        applicationDTO =new ApplicationDTO();
        applicationDTO.setId(4);
        applicationDTO.setName("BGM");
        applicationDTO.setVersion(3.1f);
        applicationDTO.setSize("1.5 GB");
        applicationDTO.setRatings(4);
        applicationDTO.setNoOfDownloads(86758943);
        applicationDTO.setCompanyName("KAFTAN");
        applicationDTO.setFeedback("NOt good than free fire");

        StoreApplicationSave storeApplicationSave = new StoreApplicationSave();
       String msg = storeApplicationSave.ApplicationDetailsSave(applicationDTO);
        System.out.println(msg);


        ApplicationDTO applicationDTO1 = new ApplicationDTO();
        applicationDTO1=new ApplicationDTO();
        applicationDTO1.setId(5);
        applicationDTO1.setName("ola");
        applicationDTO1.setVersion(3.2f);
        applicationDTO1.setSize("15 MB");
        applicationDTO1.setRatings(5);
        applicationDTO1.setNoOfDownloads(500000);
        applicationDTO1.setCompanyName("ola");
        applicationDTO1.setFeedback("taxi");


        String data = storeApplicationSave.ApplicationDetailsSave(applicationDTO1);
        System.out.println(data);

        ApplicationDTO applicationDTO2 = new ApplicationDTO();
        applicationDTO2=new ApplicationDTO();
        applicationDTO2.setId(6);
        applicationDTO2.setName("Flipcard");
        applicationDTO2.setVersion(3.7f);
        applicationDTO2.setSize("40 MB");
        applicationDTO2.setRatings(5);
        applicationDTO2.setNoOfDownloads(8000000);
        applicationDTO2.setCompanyName("Flipcard");
        applicationDTO2.setFeedback("Online Shopping");

        String data1 = storeApplicationSave.ApplicationDetailsSave(applicationDTO2);
        System.out.println(data1);

        ApplicationDTO applicationDTO3 = new ApplicationDTO();
        applicationDTO3=new ApplicationDTO();
        applicationDTO3.setId(7);
        applicationDTO3.setName("Amazon");
        applicationDTO3.setVersion(4.7f);
        applicationDTO3.setSize("45 MB");
        applicationDTO3.setRatings(5);
        applicationDTO3.setNoOfDownloads(7000000);
        applicationDTO3.setCompanyName("Amazon");
        applicationDTO3.setFeedback("Online Shopping");

        String data2 = storeApplicationSave.ApplicationDetailsSave(applicationDTO3);
        System.out.println(data2);

        ApplicationDTO applicationDTO4 = new ApplicationDTO();
        applicationDTO4=new ApplicationDTO();
        applicationDTO4.setId(8);
        applicationDTO4.setName("Mesho");
        applicationDTO4.setVersion(4.0f);
        applicationDTO4.setSize("50 MB");
        applicationDTO4.setRatings(5);
        applicationDTO4.setNoOfDownloads(500000);
        applicationDTO4.setCompanyName("Mesho");
        applicationDTO4.setFeedback("Online Shopping");

        String data3 = storeApplicationSave.ApplicationDetailsSave(applicationDTO4);
        System.out.println(data3);

        storeApplicationSave.read();

        System.out.println("=====================================");

        storeApplicationSave.findApplicationDTOById(5);

        System.out.println("=====================================");

        storeApplicationSave.findApplicationByName("Flipcard");

        System.out.println("=====================================");

        storeApplicationSave.findApplicationByVersion(4.0f);

    }
}

