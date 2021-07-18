package com.damu.mc;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int [] arrs) {
        // 1、循环错有参与游戏的小伙伴
        for (int i = 0; i < arrs.length; i ++){

            // 2、假设当前第一个位置的小伙伴，就是认识时间最短的
            int minIndex = i;

            // 3、使用当前小伙伴，和其他小伙伴做一个对比
            for(int j = i; j < arrs.length; j++) {
                // 4、时间比较--数字的比较
                if (arrs[j] < arrs[minIndex]){
                    minIndex = j;
                }
            }

            // 4、真实交换数据
            if(minIndex != i) {
                int temp = arrs[i];
                arrs[i] = arrs[minIndex];
                arrs[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] a = new int[]{1,10, 8, 29, 48, 10, 5, 18, 4};
        SelectionSort.sort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
}
