package com.xworkz.group.runner;

import com.xworkz.group.dto.SuperMarketDTO;

import java.util.ArrayList;
import java.util.Collection;

public class SuperMarketRunner {
    public static void main(String[] args) {
        SuperMarketDTO superMarketDTO1 = new SuperMarketDTO("Big Bazaar", "Bangalore", 100, 5000.0, "Ramesh Kumar");
        SuperMarketDTO superMarketDTO2 = new SuperMarketDTO("FreshMart Supermarket","Indiranagar, Bangalore",25, 3500d,"Ramesh Kumar");
        SuperMarketDTO superMarketDTO3 = new SuperMarketDTO("GreenLeaf Supermarket","Koramangala, Bangalore",30,4200,"Priya Sharma");
        SuperMarketDTO superMarketDTO4 = new SuperMarketDTO("Urban Fresh Market","Whitefield, Bangalore",20,3000,"Rajesh Nair");
        SuperMarketDTO superMarketDTO5 = new SuperMarketDTO("DailyNeeds Mart","ayanagar, Bangalore",18,3200,"Sunil Gupta");
        SuperMarketDTO superMarketDTO6 = new SuperMarketDTO("MegaMart Essentials","HSR Layout, Bangalore",25,3500,"Kavya Reddy");
        SuperMarketDTO superMarketDTO7 = new SuperMarketDTO("Nature's Hub","Banashankari, Bangalore",22,3800,"Vinay Shetty");
        SuperMarketDTO superMarketDTO8 = new SuperMarketDTO("FreshCo Market","Marathahalli, Bangalore",27,4500,"Sneha Kapoor");
        SuperMarketDTO superMarketDTO9 = new SuperMarketDTO("Family Choice Mart","Yeshwanthpur, Bangalore",19,3100,"Arjun Das");
        SuperMarketDTO superMarketDTO10 = new SuperMarketDTO("SmartBuy Groceries","Electronic City", 24,4000,"Rohit Jain");
        SuperMarketDTO superMarketDTO11 = new SuperMarketDTO("Quick Mart", "Rajajinagar", 16, 2900.0,"Deepa Malhotra");
        SuperMarketDTO superMarketDTO12 = new SuperMarketDTO("GreenMart Select", "Whitefield", 27, 4400.0, "Deepak Mehra");
        SuperMarketDTO superMarketDTO13 = new SuperMarketDTO("QuickGrocer Mart", "Chikbanavara", 19, 3100.0, "Anjana Dutta");
        SuperMarketDTO superMarketDTO14 = new SuperMarketDTO("NatureNest Essentials", "Malleswaram", 22, 3800.0, "Nishanth Rao");
        SuperMarketDTO superMarketDTO15 = new SuperMarketDTO("BrightChoice Market", "Indiranagar", 24, 4100.0, "Richa Patel");
        SuperMarketDTO superMarketDTO16 = new SuperMarketDTO("ValueMart Plus", "Maruthi Nagar", 20, 3400.0, "Ramesh Shetty");
        SuperMarketDTO superMarketDTO17 = new SuperMarketDTO("BestBasket", "Chamarajpet", 21, 3600.0, "Swati Kapoor");
        SuperMarketDTO superMarketDTO18 = new SuperMarketDTO("UrbanFresh Market", "Rajarajeshwari Nagar", 26, 4200.0, "Anil Nair");
        SuperMarketDTO superMarketDTO19 = new SuperMarketDTO("GoGreen Superstore", "Koramangala", 28, 4500.0, "Pooja Sinha");
        SuperMarketDTO superMarketDTO20 = new SuperMarketDTO("PureMart Essentials", "Hebbal Kempapura", 18, 3200.0, "Rajesh Krishnan");
        SuperMarketDTO superMarketDTO21 = new SuperMarketDTO("MegaChoice Grocers", "Sarjapur Main Road", 30, 4600.0, "Sonia Verma");
        SuperMarketDTO superMarketDTO22 = new SuperMarketDTO("The Fresh Basket", "Wilson Garden", 20, 3400.0, "Kavya Mehta");
        SuperMarketDTO superMarketDTO23 = new SuperMarketDTO("DailyMart Pro", "Lingarajapuram", 23, 3900.0, "Rohan Sharma");
        SuperMarketDTO superMarketDTO24 = new SuperMarketDTO("SmartBasket", "Majestic", 25, 4000.0, "Sneha Das");
        SuperMarketDTO superMarketDTO25 = new SuperMarketDTO("Everyday Green Mart", "Kammanahalli Main Road", 22, 3700.0, "Naveen Menon");
        SuperMarketDTO superMarketDTO26 = new SuperMarketDTO("City Essentials Store", "Nayandahalli", 19, 3200.0, "Deepa Reddy");
        SuperMarketDTO superMarketDTO27 = new SuperMarketDTO("SmartBuy Groceries", "Electronic City", 24, 4000.0, "Rohit Jain");
        SuperMarketDTO superMarketDTO28 = new SuperMarketDTO("Quick Mart", "Rajajinagar", 16, 2900.0, "Deepa Malhotra");
        SuperMarketDTO superMarketDTO29 = new SuperMarketDTO("ValueMart", "Hebbal", 20, 3200.0, "Karan Verma");
        SuperMarketDTO superMarketDTO30 = new SuperMarketDTO("Premium Basket", "Basavanagudi", 21, 3600.0, "Anil Kumar");
        SuperMarketDTO superMarketDTO31 = new SuperMarketDTO("FreshFarm Market", "HBR Layout", 18, 3000.0, "Shweta Rao");
        SuperMarketDTO superMarketDTO32 = new SuperMarketDTO("EasyMart", "JP Nagar", 23, 3700.0, "Manisha Singh");
        SuperMarketDTO superMarketDTO33 = new SuperMarketDTO("Everyday Essentials", "Nagarbhavi", 20, 3300.0, "Naveen Joshi");
        SuperMarketDTO superMarketDTO34 = new SuperMarketDTO("FreshWorld Supermarket", "Kalyan Nagar", 28, 4300.0, "Varun Patil");
        SuperMarketDTO superMarketDTO35 = new SuperMarketDTO("City Essentials Mart", "Bellandur", 22, 3900.0, "Leela Fernandes");
        SuperMarketDTO superMarketDTO36 = new SuperMarketDTO("HappyGrocers", "KR Puram", 20, 3200.0, "Gopal Krishna");
        SuperMarketDTO superMarketDTO37 = new SuperMarketDTO("PrimeMart", "BTM Layout", 26, 4000.0, "Nisha Gupta");
        SuperMarketDTO superMarketDTO38 = new SuperMarketDTO("GoFresh Superstore", "Vidyaranyapura", 18, 2900.0, "Suresh Reddy");
        SuperMarketDTO superMarketDTO39 = new SuperMarketDTO("PureHarvest Mart", "Uttarahalli", 24, 3800.0, "Meera Nair");
        SuperMarketDTO superMarketDTO40 = new SuperMarketDTO("GrocerEase", "Hennur Road", 19, 3100.0, "Ankit Sharma");
        SuperMarketDTO superMarketDTO41 = new SuperMarketDTO("Big Value Market", "Mahadevapura", 30, 4700.0, "Divya Rao");
        SuperMarketDTO superMarketDTO42 = new SuperMarketDTO("EasyGrocers", "RT Nagar", 21, 3400.0, "Prakash Jain");
        SuperMarketDTO superMarketDTO43 = new SuperMarketDTO("Everyday Basket", "Banerghatta Road", 25, 3600.0, "Rohini Shastri");
        SuperMarketDTO superMarketDTO44 = new SuperMarketDTO("FamilyMart Superstore", "Fraser Town", 17, 2800.0, "Anil Shekhar");
        SuperMarketDTO superMarketDTO45 = new SuperMarketDTO("BudgetBuy Supermarket", "Sarjapur Road", 23, 3700.0, "Ravi Kumar");
        SuperMarketDTO superMarketDTO46 = new SuperMarketDTO("Fresh & Fine Mart", "Domlur", 16, 3000.0, "Snehal Desai");
        SuperMarketDTO superMarketDTO47 = new SuperMarketDTO("The Green Basket", "Kammanahalli", 20, 3500.0, "Suman Roy");
        SuperMarketDTO superMarketDTO48 = new SuperMarketDTO("GoodChoice Market", "Silk Board", 22, 3800.0, "Karthik Reddy");
        SuperMarketDTO superMarketDTO49 = new SuperMarketDTO("FreshPoint Market", "Hoskote", 18, 3200.0, "Amrita Shenoy");
        SuperMarketDTO superMarketDTO50 = new SuperMarketDTO("Choice Mart", "Kanakapura Road", 20, 3600.0, "Ravi Mohan");
        SuperMarketDTO superMarketDTO51 = new SuperMarketDTO("The Daily Basket", "Kengeri", 19, 3000.0, "Satish Reddy");
        SuperMarketDTO superMarketDTO52 = new SuperMarketDTO("HappyMart", "Bommanahalli", 21, 3700.0, "Manju Varma");
        SuperMarketDTO superMarketDTO53 = new SuperMarketDTO("BigBasket Express", "Peenya", 26, 4200.0, "Kavitha Raju");
        SuperMarketDTO superMarketDTO54 = new SuperMarketDTO("CityGrocers", "Yelahanka", 24, 4000.0, "Ashwin Kumar");
        SuperMarketDTO superMarketDTO55 = new SuperMarketDTO("UrbanMart Essentials", "Old Airport Road", 22, 3800.0, "Neha Singh");
        SuperMarketDTO superMarketDTO56 = new SuperMarketDTO("MegaGreen Store", "Sahakara Nagar", 28, 4300.0, "Harish Bhat");
        SuperMarketDTO superMarketDTO57 = new SuperMarketDTO("NatureFresh Mart", "Dasarahalli", 20, 3200.0, "Sneha Arora");
        SuperMarketDTO superMarketDTO58 = new SuperMarketDTO("BrightMart", "MG Road", 30, 4500.0, "Rohan D'Souza");
        SuperMarketDTO superMarketDTO59 = new SuperMarketDTO("BestBuy Grocers", "Richmond Town", 16, 3000.0, "Lakshmi Nair");
        SuperMarketDTO superMarketDTO60 = new SuperMarketDTO("GreenGold Mart", "Uttarahalli Main Road", 25, 4000.0, "Ajay Pandey");
        SuperMarketDTO superMarketDTO61 = new SuperMarketDTO("Supreme Essentials", "VV Puram", 23, 3800.0, "Priyanka Rao");
        SuperMarketDTO superMarketDTO62 = new SuperMarketDTO("NewTown Mart", "Brookefield", 18, 3200.0, "Mahesh Gowda");
        SuperMarketDTO superMarketDTO63 = new SuperMarketDTO("EcoChoice Supermarket", "Nayandahalli", 21, 3600.0, "Rekha Joshi");
        SuperMarketDTO superMarketDTO64 = new SuperMarketDTO("MetroMart Essentials", "Banaswadi", 22, 3900.0, "Sandeep Malhotra");
        SuperMarketDTO superMarketDTO65 = new SuperMarketDTO("Fresh Choice Superstore", "Jakkur", 24, 4100.0, "Anjana Patel");
        SuperMarketDTO superMarketDTO66 = new SuperMarketDTO("SuperGrocers", "Nagasandra", 20, 3300.0, "Nitin Rao");
        SuperMarketDTO superMarketDTO67 = new SuperMarketDTO("The Smart Basket", "Thanisandra", 26, 4000.0, "Pooja Iyer");
        SuperMarketDTO superMarketDTO68 = new SuperMarketDTO("DailyMart Essentials", "Chikkaballapur", 19, 3000.0, "Tarun Shah");
        SuperMarketDTO superMarketDTO69 = new SuperMarketDTO("PrimeFresh Market", "Kumbalgodu", 25, 3800.0, "Shilpa Shetty");
        SuperMarketDTO superMarketDTO70 = new SuperMarketDTO("BudgetEase Mart", "Hegde Nagar", 21, 3700.0, "Arvind Krishnan");
        SuperMarketDTO superMarketDTO71 = new SuperMarketDTO("Swift Mart", "Anekal", 18, 3100.0, "Meena Ramesh");
        SuperMarketDTO superMarketDTO72 = new SuperMarketDTO("LocalGrocers", "Kothanur", 20, 3500.0, "Dinesh Gowda");
        SuperMarketDTO superMarketDTO73 = new SuperMarketDTO("SimplyFresh Supermarket", "Hoskote Main Road", 23, 3900.0, "Rachana Kapoor");
        SuperMarketDTO superMarketDTO74 = new SuperMarketDTO("EasyGrocers Pro", "Bannerghatta Main Road", 17, 3200.0, "Gauri Menon");
        SuperMarketDTO superMarketDTO75 = new SuperMarketDTO("MaxChoice Mart", "Channasandra", 28, 4300.0, "Akshay Rao");
        SuperMarketDTO superMarketDTO76 = new SuperMarketDTO("PremiumFresh Market", "Bellary Road", 24, 4000.0, "Swati Bhat");
        SuperMarketDTO superMarketDTO77 = new SuperMarketDTO("GreenMart Pro", "Shivajinagar", 22, 3800.0, "Mohan Krishna");
        SuperMarketDTO superMarketDTO78 = new SuperMarketDTO("Golden Basket", "Ejipura", 26,4100,"Preeti Deshpande");
        SuperMarketDTO superMarketDTO79 = new SuperMarketDTO("DailyFresh Mart", "Banashankari", 22, 3800.0, "Karthik Shetty");
        SuperMarketDTO superMarketDTO80 = new SuperMarketDTO("UrbanChoice Market", "JP Nagar", 24, 4200.0, "Sneha Prasad");
        SuperMarketDTO superMarketDTO81 = new SuperMarketDTO("Smart Essentials Superstore", "Electronic City", 20, 3500.0, "Ramesh Reddy");
        SuperMarketDTO superMarketDTO82 = new SuperMarketDTO("GreenNest Grocers", "Yeshwanthpur", 23, 3900.0, "Anjali Verma");
        SuperMarketDTO superMarketDTO83 = new SuperMarketDTO("EcoMart Plus", "BTM Layout", 27, 4300.0,"Akash Nair");

        Collection<SuperMarketDTO> collection = new ArrayList<>();
        collection.add(superMarketDTO1);
        collection.add(superMarketDTO2);
        collection.add(superMarketDTO3);
        collection.add(superMarketDTO4);
        collection.add(superMarketDTO5);
        collection.add(superMarketDTO6);
        collection.add(superMarketDTO7);
        collection.add(superMarketDTO8);
        collection.add(superMarketDTO9);
        collection.add(superMarketDTO10);
        collection.add(superMarketDTO11);
        collection.add(superMarketDTO12);
        collection.add(superMarketDTO13);
        collection.add(superMarketDTO14);
        collection.add(superMarketDTO15);
        collection.add(superMarketDTO16);
        collection.add(superMarketDTO17);
        collection.add(superMarketDTO18);
        collection.add(superMarketDTO19);
        collection.add(superMarketDTO20);
        collection.add(superMarketDTO21);
        collection.add(superMarketDTO22);
        collection.add(superMarketDTO23);
        collection.add(superMarketDTO24);
        collection.add(superMarketDTO25);
        collection.add(superMarketDTO26);
        collection.add(superMarketDTO27);
        collection.add(superMarketDTO28);
        collection.add(superMarketDTO29);
        collection.add(superMarketDTO30);
        collection.add(superMarketDTO31);
        collection.add(superMarketDTO32);
        collection.add(superMarketDTO33);
        collection.add(superMarketDTO34);
        collection.add(superMarketDTO35);
        collection.add(superMarketDTO36);
        collection.add(superMarketDTO37);
        collection.add(superMarketDTO38);
        collection.add(superMarketDTO39);
        collection.add(superMarketDTO40);
        collection.add(superMarketDTO41);
        collection.add(superMarketDTO42);
        collection.add(superMarketDTO43);
        collection.add(superMarketDTO44);
        collection.add(superMarketDTO45);
        collection.add(superMarketDTO46);
        collection.add(superMarketDTO47);
        collection.add(superMarketDTO48);
        collection.add(superMarketDTO49);
        collection.add(superMarketDTO50);
        collection.add(superMarketDTO51);
        collection.add(superMarketDTO52);
        collection.add(superMarketDTO53);
        collection.add(superMarketDTO54);
        collection.add(superMarketDTO55);
        collection.add(superMarketDTO56);
        collection.add(superMarketDTO57);
        collection.add(superMarketDTO58);
        collection.add(superMarketDTO59);
        collection.add(superMarketDTO60);
        collection.add(superMarketDTO61);
        collection.add(superMarketDTO62);
        collection.add(superMarketDTO63);
        collection.add(superMarketDTO64);
        collection.add(superMarketDTO65);
        collection.add(superMarketDTO66);
        collection.add(superMarketDTO67);
        collection.add(superMarketDTO68);
        collection.add(superMarketDTO69);
        collection.add(superMarketDTO70);
        collection.add(superMarketDTO71);
        collection.add(superMarketDTO72);
        collection.add(superMarketDTO73);
        collection.add(superMarketDTO74);
        collection.add(superMarketDTO75);
        collection.add(superMarketDTO76);
        collection.add(superMarketDTO77);
        collection.add(superMarketDTO78);
        collection.add(superMarketDTO79);
        collection.add(superMarketDTO80);
        collection.add(superMarketDTO81);
        collection.add(superMarketDTO82);
        collection.add(superMarketDTO83);


        for (SuperMarketDTO dto:collection)
        {
            if (dto.getTotalStaff()>=20)
            {
                System.out.println(dto);
            }
        }

        System.out.println("===========================================================================================");

        for (SuperMarketDTO dto:collection)
        {
            if (dto.getTotalArea()<3000 && dto.getTotalStaff()<20)
            {
                System.out.println("Total Area and Total Staff: " +dto);
            }
        }

        System.out.println("===========================================================================================");

        for (SuperMarketDTO dto:collection)
        {
            System.out.println("Manager Name:" +dto.getManagerName());
        }

        System.out.println("===========================================================================================");

        for (SuperMarketDTO dto:collection)
        {
            System.out.println("Name: " +dto.getName());
        }

        for (SuperMarketDTO dto:collection)
        {
           if(dto.getLocation().equals("Anekal"))
           {
               System.out.println("Location matched with Anekal, "+dto);
           }
        }

    }
}
//find all by location
//find all by totalStaff greaterThan
//find all by totalArea and totalStaff
//print managerName
//print name