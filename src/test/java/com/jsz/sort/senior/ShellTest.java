package com.jsz.sort.senior;

import java.util.Arrays;

/**
 * description:测试希尔排序
 *
 * @Author jsz
 * @Date 2022-10-31
 **/
public class ShellTest {
    public static void main(String[] args) {
        Integer[] arr={20,8,19,10,18};
        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
