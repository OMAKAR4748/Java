package com.xworkz.Runner;

import com.xworkz.things.JaguarTap;
import com.xworkz.things.Tap;
import com.xworkz.things.Tool;

import java.util.Arrays;

public class ToolRunner {
    public static void main(String[] args) {
        JaguarTap jaguarTap=new JaguarTap();
        System.out.println("===========================");

        Tool tool=new Tap();
        System.out.println("=============================");

        Tool tool1 =new JaguarTap();
        System.out.println("=============================");

        Tool tool2=new Tool();


    }
}
