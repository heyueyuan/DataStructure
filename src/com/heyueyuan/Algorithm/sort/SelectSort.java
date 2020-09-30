package com.heyueyuan.Algorithm.sort;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[80000];
        for(int i = 0; i<80000; i++) {
            arr[i] = (int)(Math.random() * 8000000);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date1);
        System.out.println(date1Str);

        selectsort(arr);

        Date date2 = new Date();
        String date2Str = simpleDateFormat.format(date2 );
        System.out.println(date2Str);
    }

    public static void selectsort(int[] arr) {

        for (int i = 0; i < arr.length - 1 ; i++) {
            int minIndex = i;
            int min = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }

    }
}
