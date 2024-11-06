package com.xworkz.instance;

public class Festival{
    String name;
    String date;
    String mainGod;


    public Festival(String name, String date, String mainGod) {
        this.name = name;
        this.date = date;
        this.mainGod = mainGod;
    }


    @Override
    public boolean equals(Object obj) {

        if (obj == null) return false;
            if (obj instanceof Festival) {
                System.out.println("Festival");
                Festival festival = (Festival) obj;
                if (name.equals(festival.name) && date.equals(festival.date) && mainGod.equals(festival.mainGod)) {
                    System.out.println("Festival is same");
                    return true;
                } else {
                    System.out.println("Festival is not be same");
                }
            }
            return false;

    }
}
