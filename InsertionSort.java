package com.damu.mc;

import java.util.Arrays;

public class InsertionSort {
    /**
     * 插入排序：空间复杂度：O(1)
     * 时间复杂度：O(n^2)
     * @param arrs
     */
    public static void sort(int [] arrs){
        // 1、循环购买玩具：模拟玩具的增加过程
        for (int i = 0; i < arrs.length; i++) { // 从左到右 --> 循环
            // 2、对自己已有的玩具进行排序
//            for(int j = 0; j < i; j++) { // 和循环同向-数据比较：部分数据位置错乱！-数据交换位置
            for(int j = i-1; j >= 0; j--) { // 数据比较--> 从右往左
                // 3、对玩具进行喜爱程度(数字大小)排序：交换数据--> 正确的结果
                if (arrs[j] > arrs[j+1]) {
                    // 交换数据/玩具
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
