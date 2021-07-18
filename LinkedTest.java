package com.damu.mc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedTest {

    public static void main(String[] args) {
        // 数组实现
        List<String> array = new ArrayList<>();
        // 链表实现
        List<String> linked = new LinkedList<>();

        // 新增数据
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            array.add("hello damu"); // 769 9897
            // 查询、修改
        }
        long end = System.nanoTime();
        System.out.println("array: " + (end - start));

        long start2 = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linked.add("hello damu"); // 367 9529
            // 新增、删除
        }
        long end2 = System.nanoTime();
        System.out.println("linked: " + (end2 - start2));

    }
}
