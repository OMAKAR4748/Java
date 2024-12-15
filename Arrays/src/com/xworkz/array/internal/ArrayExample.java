package com.xworkz.array.internal;

public class ArrayExample {
    public static void main(String[] args) {
        int age[] = {20,21,23,24,25};

        for(int i=0;i<age.length;i++)
        System.out.println("Age is :"+age[i]);


        System.out.println("=================================");

        //add total value

        int sum =0;
        for (int ages:age)
        {
            sum += ages;
        }
        System.out.println("Sum is "+sum);

        System.out.println("=================================");

        //Minimum and Maximum

        int min =Integer.MAX_VALUE;
        int max =Integer.MIN_VALUE;
        for(int ages: age)
        {
            if(ages < min)
            {
                min = ages;
            }
            if(ages > max)
            {
                max = ages;
            }
        }
        System.out.println("Minimum is "+min);

        System.out.println("=================================");

        System.out.println("Maximum is "+max);

        System.out.println("=======================================");

        //row and column
        int marks[][]={{12,98,34},{12,68,58},{47,79,33},{46,79,24}};

        System.out.println("Position:"+marks[2][1]);
        System.out.println("Position:"+marks[1][2]);
        System.out.println("Position:"+marks[0][0]);
    }

}
