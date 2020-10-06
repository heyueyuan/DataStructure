package com.heyueyuan.Algorithm.search;

import java.util.Arrays;

public class InsertValueSearch {
    public static void main(String[] args) {

//        int[] arr = new int[100];
//        for (int i = 0; i < 100; i++) {
//            arr[i] = i + 1;
//        }
//
//        System.out.println(Arrays.toString(arr));

        int arr[] = { 1, 8, 10, 89,1000,1000, 1234 };
        int index = insertValueSearch(arr, 0, arr.length - 1, 1234);
        System.out.println(index);
    }

    public static int insertValueSearch(int[] arr, int left, int right, int value) {
        if (left > right || value < arr[0] || value > arr[arr.length - 1]) {
            return -1;
        }

        int mid = left + (right - left) * (value - arr[left]) / (arr[right] - arr[left]);
        int midVal = arr[mid];
        if (value > midVal) {
            return insertValueSearch(arr, mid + 1, right, value);
        } else if (value < midVal) {
            return insertValueSearch(arr, left, mid - 1, value);
        } else {
            return mid;
        }
    }
}
