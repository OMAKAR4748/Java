package com.xworkz.Runner;

import com.xworkz.things.LuluMall;
import com.xworkz.things.Mall;
import com.xworkz.things.MantriMall;
import com.xworkz.things.OrionMall;

public class MallRunner {
    public static void main(String[] args) {
        Mall orionmall =new OrionMall();

        OrionMall orionMall=new OrionMall();
        orionMall.open();
        orionMall.close();
        orionMall.elevator();
        orionMall.security();
        orionMall.sales();

        System.out.println("===============================================");

        Mall orionmall1 =new OrionMall();
        OrionMall orionMall1=new OrionMall();
        orionMall1.open();
        orionMall1.close();
        orionMall1.elevator();
        orionMall1.security();
        orionMall1.sales();

        System.out.println("===============================================");

        Mall luluMAll =new LuluMall();
        LuluMall luluMall = new LuluMall();
        luluMall.open();
        luluMall.close();
        luluMall.elevator();
        luluMall.security();
        luluMall.discount();

        System.out.println("===============================================");

        Mall luluMAll1 =new LuluMall();
        LuluMall luluMall1 = new LuluMall();
        luluMall1.open();
        luluMall1.close();
        luluMall1.elevator();
        luluMall1.security();
        luluMall1.discount();

        System.out.println("===============================================");


        MantriMall mantriMall=new MantriMall();
        mantriMall.open();
        mantriMall.close();
        mantriMall.elevator();
        mantriMall.security();
        mantriMall.time();

        System.out.println("===============================================");


        MantriMall mantriMall1=new MantriMall();
        mantriMall1.open();
        mantriMall1.close();
        mantriMall1.elevator();
        mantriMall1.security();
        mantriMall1.time();

    }
}
