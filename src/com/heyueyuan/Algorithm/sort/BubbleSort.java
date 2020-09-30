package com.heyueyuan.Algorithm.sort;

import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {
    public static void main(String[] args) {
//        int arr[] = {3, 9, -1, 10, -2};
//
//        bubblesort(arr);
//        System.out.println(Arrays.toString(arr));
        int[] arr = new int[80000];
        for(int i = 0; i<80000; i++) {
            arr[i] = (int)(Math.random() * 8000000);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date1Str = simpleDateFormat.format(date1);
        System.out.println(date1Str);

        bubblesort(arr);

        Date date2 = new Date();
        String date2Str = simpleDateFormat.format(date2 );
        System.out.println(date2Str);
    }

    public static void bubblesort(int[] arr) {
        int temp = 0;
        boolean flag = false;
        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j< arr.length - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag) {
                break;
            } else {
                flag = false;
            }
        }
    }
}
