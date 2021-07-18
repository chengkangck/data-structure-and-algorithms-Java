package com.damu.mc;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int [] arrs) {
        // 1、Contains all the characters participating in the game
        for (int i = arrs.length - 1; i > 0; i--) {
            // 2、Control the process of exchanging handkerchiefs
            for (int j = 0; j < i; j++) {
                // 3、Set the conditions for exchanging handkerchiefs
                if (arrs[j] > arrs[j+1]) {
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a = new int [] {9, 5, 1, 2, 7, 3, 4, 8, 6};

        BubbleSort.bubbleSort(a);
        // Print and display the sorting results
        Arrays.stream(a).forEach(System.out::println);
    }
}
