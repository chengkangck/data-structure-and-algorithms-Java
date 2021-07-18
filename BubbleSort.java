package com.damu.mc;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int [] arrs) {
        // 1、包含所有参与游戏的人物
        for (int i = arrs.length - 1; i > 0; i--) {
            // 2、控制交换手绢的过程
            for (int j = 0; j < i; j++) {
                // 3、设置交换手绢的条件
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
        // 打印展示排序结果
        Arrays.stream(a).forEach(System.out::println);
    }
}
