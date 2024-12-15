package com.xworkz.conditionStatement.internal;

public class IfExample {
    public static void main(String[] args) {
        //if- else
//        int age = 14;
//        if(age >= 18)
//        {
//            System.out.println("you can vote");
//        }
//        else {
//            System.out.println("you cannot vote");
//        }


        //if-else-if-else
//        int day =3;
//        if (day ==1)
//        {
//            System.out.println("Go to Home");
//        } else if (day == 2) {
//            System.out.println("Go to the Village");
//        } else if (day == 3) {
//            System.out.println("Go to Party");
//        }
//        else {
//            System.out.println("Go to office");
//        }
//        System.out.println("Went Somewhere today");


        // You are given three numbers, find the maximum number
//        int a = 4;
//        int b = 8;
//        int c = 11;
//
//        if(a>b) {
//            System.out.println("a is bigger than b");
//            if (a > c) {
//                System.out.println("a is bigger than c");
//                System.out.println("a is largest " + c);
//
//            } else {
//                System.out.println("c is bigger than a");
//                System.out.println("c is largest " + a);
//            }
//        } else {
//             System.out.println("b is bigger than a");
//                if(b>c)
//                {
//                    System.out.println("b is bigger than c");
//                    System.out.println("b is largest "+b);
//
//                }else {
//                    System.out.println("c is bigger than b");
//                    System.out.println("c is largest "+ c);
//                }
//        }

        int a = 26;
        int b = 23;
        int c = 124;
        int max = 0;

        if(a>b)
        {
            max = a;
        }
        else {
            max =b;
        }
        max =a>b ? a>c?a:c:b>c?b:c;
        System.out.println("value of max "+max);
    }
}
