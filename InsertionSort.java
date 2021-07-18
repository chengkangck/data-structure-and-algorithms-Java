package com.damu.mc;

import java.util.Arrays;

public class InsertionSort {
    /**
      * Insertion sort: space complexity: O(1)
      * Time complexity: O(n^2)
      * @param arrs
     */
    public static void sort(int [] arrs){
        // 1、Buy toys in cycles: simulate the increase process of toys
        for (int i = 0; i < arrs.length; i++) { // from left to right --> loop
            // 2、Sort the toys you already have
//            for(int j = 0; j < i; j++) { // Same direction as the loop-data comparison: some data is out of position! -Data exchange location
            for(int j = i-1; j >= 0; j--) { // Data comparison --> from right to left
                // 3、Sort toys by degree of favorite (number size): exchange data --> correct result
                if (arrs[j] > arrs[j+1]) {
                    // exchange data/toys
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a = new int [] {10, 8, 100, 78, 66, 33, 88};

        InsertionSort.sort(a);

        Arrays.stream(a).forEach(System.out::println);
    }
}
