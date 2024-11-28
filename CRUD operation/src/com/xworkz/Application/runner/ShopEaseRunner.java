package com.xworkz.Application.runner;
import com.xworkz.Application.shop.ShopEaseDTO;
import com.xworkz.Application.shop.StoreShopEaseSave;

public class ShopEaseRunner {
    public static void main(String[] args) {
        ShopEaseDTO shopEaseDTO1 = new ShopEaseDTO();
        shopEaseDTO1.setProductId(1);
        shopEaseDTO1.setProductName("Product A");
        shopEaseDTO1.setPrice(29.99);
        shopEaseDTO1.setCategory("Electronics");
        shopEaseDTO1.setStock(100);
        shopEaseDTO1.setRating(4);
        shopEaseDTO1.setNumberOfReviews(150);
        shopEaseDTO1.setSellerName("Seller 1");
        shopEaseDTO1.setDescription("High quality electronic product.");

        StoreShopEaseSave storeShopEaseSave = new StoreShopEaseSave();
        String msg1 = storeShopEaseSave.saveShopEaseDetails(shopEaseDTO1);
        System.out.println(msg1);

        ShopEaseDTO shopEaseDTO2 = new ShopEaseDTO();
        shopEaseDTO2.setProductId(2);
        shopEaseDTO2.setProductName("Product B");
        shopEaseDTO2.setPrice(19.99);
        shopEaseDTO2.setCategory("Books");
        shopEaseDTO2.setStock(50);
        shopEaseDTO2.setRating(5);
        shopEaseDTO2.setNumberOfReviews(200);
        shopEaseDTO2.setSellerName("Seller 2");
        shopEaseDTO2.setDescription("Best-selling book.");

        String msg2 = storeShopEaseSave.saveShopEaseDetails(shopEaseDTO2);
        System.out.println(msg2);

        ShopEaseDTO shopEaseDTO3 = new ShopEaseDTO();
        shopEaseDTO3.setProductId(3);
        shopEaseDTO3.setProductName("Product C");
        shopEaseDTO3.setPrice(9.99);
        shopEaseDTO3.setCategory("Clothing");
        shopEaseDTO3.setStock(300);
        shopEaseDTO3.setRating(3);
        shopEaseDTO3.setNumberOfReviews(75);
        shopEaseDTO3.setSellerName("Seller 3");
        shopEaseDTO3.setDescription("Comfortable and stylish.");

        String msg3 = storeShopEaseSave.saveShopEaseDetails(shopEaseDTO3);
        System.out.println(msg3);

        ShopEaseDTO shopEaseDTO4 = new ShopEaseDTO();
        shopEaseDTO4.setProductId(4);
        shopEaseDTO4.setProductName("Product D");
        shopEaseDTO4.setPrice(49.99);
        shopEaseDTO4.setCategory("Home Appliances");
        shopEaseDTO4.setStock(20);
        shopEaseDTO4.setRating(4);
        shopEaseDTO4.setNumberOfReviews(25);
        shopEaseDTO4.setSellerName("Seller 4");
        shopEaseDTO4.setDescription("Durable and efficient.");

        String msg4 = storeShopEaseSave.saveShopEaseDetails(shopEaseDTO4);
        System.out.println(msg4);

        ShopEaseDTO shopEaseDTO5 = new ShopEaseDTO();
        shopEaseDTO5.setProductId(5);
        shopEaseDTO5.setProductName("Product E");
        shopEaseDTO5.setPrice(99.99);
        shopEaseDTO5.setCategory("Fitness Equipment");
        shopEaseDTO5.setStock(10);
        shopEaseDTO5.setRating(5);
        shopEaseDTO5.setNumberOfReviews(50);
        shopEaseDTO5.setSellerName("Seller 5");
        shopEaseDTO5.setDescription("Perfect for home workouts.");

        String msg5 = storeShopEaseSave.saveShopEaseDetails(shopEaseDTO5);
        System.out.println(msg5);

        storeShopEaseSave.read();

        System.out.println("=====================================");

        storeShopEaseSave.findShopEaseDTOById(2);

        System.out.println("=====================================");

        storeShopEaseSave.findShopEaseByName("Product C");

        System.out.println("=====================================");

        storeShopEaseSave.findShopEaseByCategory("Books");
    }
}
