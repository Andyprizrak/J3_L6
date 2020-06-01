package ru.geekbrains.home_j3_lesson6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] arr1 = new int [] {0,1,4,2,3,6,4,1,7};

        HomeTask1 ht1 = new HomeTask1();
        System.out.println(Arrays.toString(ht1.doTask1(arr1)));

        HomeTask2 ht2 = new HomeTask2();
        System.out.println(ht2.doTask2(arr1));

        int [] arr2 = new int[]{0,0,3};
        System.out.println(ht2.doTask2(arr2));

    }
}
