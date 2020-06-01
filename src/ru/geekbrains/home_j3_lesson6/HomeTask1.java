package ru.geekbrains.home_j3_lesson6;

import java.util.Arrays;

public class HomeTask1 {
    public int[] doTask1(int[] arr) throws RuntimeException {

        int[] res;
        int i = arr.length - 1, j = 0;
        boolean found = false;
        while (i >= 0 && !found) {
            found = arr[i] == 4;
            j = i;
            i--;
        }
        if (found) res = Arrays.copyOfRange(arr,j+1,arr.length);
         else  throw new RuntimeException("Array havent 4");

        return  res;
    }
}
