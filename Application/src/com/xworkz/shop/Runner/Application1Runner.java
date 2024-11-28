package com.xworkz.shop.Runner;

import com.xworkz.shop.Application.Application1DTO;
import com.xworkz.shop.store.StoreApplication1Save;
import java.util.Date;

public class Application1Runner {
    public static void main(String[] args) {
        Application1DTO application1DTO = new Application1DTO();
        application1DTO.setId(4);
        application1DTO.setName("BGM");
        application1DTO.setVersion(3.1f);
        application1DTO.setSize("1.5 GB");
        application1DTO.setRatings(4);
        application1DTO.setNoOfDownloads(86758943);
        application1DTO.setCompanyName("KAFTAN");
        application1DTO.setFeedback("Not good than free fire");
        application1DTO.setReleaseDate(new Date());
        application1DTO.setUpdatedDate(new Date());

        StoreApplication1Save storeApplication1Save = new StoreApplication1Save();
        String msg = storeApplication1Save.ApplicationDetailsSave(application1DTO);
        System.out.println(msg);

        Application1DTO application1DTO1 = new Application1DTO();
        application1DTO1.setId(5);
        application1DTO1.setName("ola");
        application1DTO1.setVersion(3.2f);
        application1DTO1.setSize("15 MB");
        application1DTO1.setRatings(5);
        application1DTO1.setNoOfDownloads(500000);
        application1DTO1.setCompanyName("ola");
        application1DTO1.setFeedback("taxi");
        application1DTO1.setReleaseDate(new Date());
        application1DTO1.setUpdatedDate(new Date());

        String data = storeApplication1Save.ApplicationDetailsSave(application1DTO1);
        System.out.println(data);

        Application1DTO application1DTO2 = new Application1DTO();
        application1DTO2.setId(6);
        application1DTO2.setName("Flipkart");
        application1DTO2.setVersion(3.7f);
        application1DTO2.setSize("40 MB");
        application1DTO2.setRatings(5);
        application1DTO2.setNoOfDownloads(8000000);
        application1DTO2.setCompanyName("Flipkart");
        application1DTO2.setFeedback("Online Shopping");
        application1DTO2.setReleaseDate(new Date());
        application1DTO2.setUpdatedDate(new Date());

        String data1 = storeApplication1Save.ApplicationDetailsSave(application1DTO2);
        System.out.println(data1);

        Application1DTO application1DTO3 = new Application1DTO();
        application1DTO3.setId(7);
        application1DTO3.setName("Amazon");
        application1DTO3.setVersion(4.7f);
        application1DTO3.setSize("45 MB");
        application1DTO3.setRatings(5);
        application1DTO3.setNoOfDownloads(7000000);
        application1DTO3.setCompanyName("Amazon");
        application1DTO3.setFeedback("Online Shopping");
        application1DTO3.setReleaseDate(new Date());
        application1DTO3.setUpdatedDate(new Date());

        String data2 = storeApplication1Save.ApplicationDetailsSave(application1DTO3);
        System.out.println(data2);

        Application1DTO application1DTO4 = new Application1DTO();
        application1DTO4.setId(8);
        application1DTO4.setName("Meesho");
        application1DTO4.setVersion(4.0f);
        application1DTO4.setSize("50 MB");
        application1DTO4.setRatings(5);
        application1DTO4.setNoOfDownloads(500000);
        application1DTO4.setCompanyName("Meesho");
        application1DTO4.setFeedback("Online Shopping");
        application1DTO4.setReleaseDate(new Date());
        application1DTO4.setUpdatedDate(new Date());

        String data3 = storeApplication1Save.ApplicationDetailsSave(application1DTO4);
        System.out.println(data3);

        storeApplication1Save.read();

        System.out.println("=====================================");

        storeApplication1Save.findApplicationDTOById(5);

        System.out.println("=====================================");

        storeApplication1Save.findApplicationByName("Flipkart");

        System.out.println("=====================================");

        storeApplication1Save.findApplicationByVersion(4.0f);

        // Update application updatedDate by ID
        Date newUpdatedDate = new Date();
        storeApplication1Save.updateApplicationDate(4, newUpdatedDate);
    }
}
