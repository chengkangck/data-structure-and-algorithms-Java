package com.damu.mc;

import java.util.Arrays;

/**
 * 排序方式：快速排序的操作方式较高
 *      空间复杂度O(log n) 时间复杂度(n log n)
 */
public class QuickSort {

    public static void sort(int [] a, int left, int right) {
        // 设置排序结束的条件
        if( left > right ){
            return;
        }
        // 记录左边编号、记录右边编号
        int i = left, j = right;
        // 记录基准数字
        int base = a[left];

        // 核心算法
        while (i != j){
            // 右侧编号查找数字
            while(j > i && a[j] >= base) {
                j--;
            }
            // 左侧编号查找数字
            while(i < j && a[i] <= base) {
                i++;
            }
            // 数字交换
            if(i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        // 基准数字 和 i位置数字的交换
        a[left] = a[i];
        a[i] = base;

        // i位置是基准数字，不再参与排序过程
        // 左侧数字进行二次分类
        sort(a, left, i - 1);
        // 右侧数字进行二次分类
        sort(a, i + 1, right);
    }

    public static void sort(int [] a){
        sort(a, 0, a.length-1);
    }

    public static void main(String[] args) {
        int [] a = {5,2,12,6,67,3,2,3,6,5,23,243,32,567,67,878,3,34,6,6,345,23,21,3,45,100,45,23,2,3,45};
        QuickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
