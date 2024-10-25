package com.xworkz.Runner;

import com.xworkz.things.HondaFactory;
import com.xworkz.things.HyundaiFactory;
import com.xworkz.things.TataFactory;
import com.xworkz.things.TvsFactory;

public class FactoryRunner {
    public static void main(String[] args) {
        TataFactory tataFactory=new TataFactory();
        tataFactory.manufacture();
        tataFactory.dispose();
        tataFactory.power();
        tataFactory.start();
        tataFactory.run();
        tataFactory.sales();

        System.out.println("==================================================");


        TataFactory tataFactory1=new TataFactory();
        tataFactory1.manufacture();
        tataFactory1.dispose();
        tataFactory1.power();
        tataFactory1.start();
        tataFactory1.run();
        tataFactory1.sales();

        System.out.println("==================================================");

        HondaFactory hondaFactory=new HondaFactory();
        hondaFactory.manufacture();
        hondaFactory.dispose();
        hondaFactory.power();
        hondaFactory.start();
        hondaFactory.run();
        hondaFactory.speed();

        System.out.println("==================================================");

        HondaFactory hondaFactory1=new HondaFactory();
        hondaFactory1.manufacture();
        hondaFactory1.dispose();
        hondaFactory1.power();
        hondaFactory1.start();
        hondaFactory1.run();
        hondaFactory1.speed();

        System.out.println("==================================================");

        HyundaiFactory hyundaiFactory=new HyundaiFactory();
        hyundaiFactory.manufacture();
        hyundaiFactory.dispose();
        hyundaiFactory.power();
        hyundaiFactory.start();
        hyundaiFactory.run();
        hyundaiFactory.holiday();

        System.out.println("==================================================");

        HyundaiFactory hyundaiFactory1=new HyundaiFactory();
        hyundaiFactory1.manufacture();
        hyundaiFactory1.dispose();
        hyundaiFactory1.power();
        hyundaiFactory1.start();
        hyundaiFactory1.run();
        hyundaiFactory1.holiday();

        System.out.println("==================================================");

        TvsFactory tvsFactory=new TvsFactory();
        tvsFactory.manufacture();
        tvsFactory.power();
        tvsFactory.start();
        tvsFactory.run();
        tvsFactory.time();

        System.out.println("==================================================");

        TvsFactory tvsFactory1=new TvsFactory();
        tvsFactory1.manufacture();
        tvsFactory1.power();
        tvsFactory1.start();
        tvsFactory1.run();
        tvsFactory1.time();

    }
}

