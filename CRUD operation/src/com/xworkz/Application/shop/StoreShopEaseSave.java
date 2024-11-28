package com.xworkz.Application.shop;



public class StoreShopEaseSave {
    ShopEaseDTO shopEaseDTO[] = new ShopEaseDTO[5];
    int index;

    public String saveShopEaseDetails(ShopEaseDTO dto) {
        if (dto != null) {
            shopEaseDTO[index] = dto;
            index++;
            return "Data is saved";
        } else {
            return "Data is not saved";
        }
    }

    public void read() {
        for (int i = 0; i < shopEaseDTO.length; i++) {
            System.out.println(shopEaseDTO[i]);
        }
    }

    public void findShopEaseDTOById(int id) {
        for (int i = 0; i < shopEaseDTO.length; i++) {
            if (shopEaseDTO[i] != null && shopEaseDTO[i].getProductId() == id) {
                System.out.println(shopEaseDTO[i]);
            }
        }
    }

    public void findShopEaseByName(String productC) {
        for (int i = 0; i < shopEaseDTO.length; i++) {
            if (shopEaseDTO[i] != null && shopEaseDTO[i].getProductName().equals(productC)) {
                System.out.println(shopEaseDTO[i]);
            }
        }
    }

    public void findShopEaseByCategory(String books) {
        for (int i = 0; i < shopEaseDTO.length; i++) {
            if (shopEaseDTO[i] != null && shopEaseDTO[i].getCategory().equals(books)) {
                System.out.println(shopEaseDTO[i]);
            }
        }
    }

}



