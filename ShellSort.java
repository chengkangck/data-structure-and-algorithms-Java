package com.damu.mc;

import java.util.Arrays;

public class ShellSort {

    public static void sort(int [] arrs){
        // 1、初始化-得到小组：数目
        int gap = arrs.length / 2;
        // 声明一个变量，记录当前数据
        int current;

        // 2、循环遍历-->所有小组[小组是动态更新(递减的过程)]
        while(gap > 0) {
            // 3、对当前小组中的数据进行遍历操作
            for(int j = gap; j < arrs.length; j++) {
                current = arrs[j]; // 当前需要比较的数据
                int preIndex = j - gap;// 得到小组内上一个数据的索引

                // 4、内部数据进行插入排序
                while(preIndex >= 0 && current < arrs[preIndex]) {
                    // 数据交换
                    arrs[preIndex + gap] = arrs[preIndex];
                    preIndex -= gap;
                }
                arrs[preIndex + gap] = current;
            }

            gap = gap / 2;
        }
    }

    public static void main(String[] args) {
        int [] a = new int [] {19, 80, 2, 7, 4, 1, 10, 12, 88, 44, 33,29, 80};

        ShellSort.sort(a);

        // 展示排序完成后的数据
        System.out.println(Arrays.toString(a));
    }
}
