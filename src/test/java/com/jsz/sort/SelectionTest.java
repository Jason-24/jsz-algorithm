package com.jsz.sort;

import java.util.Arrays;

/**
 * description:选择测试类
 *
 * @Author jsz
 * @Date 2022-10-26
 **/
public class SelectionTest {
    public static void main(String[] args) {
        Integer[] arr={20,8,19,10,18};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
