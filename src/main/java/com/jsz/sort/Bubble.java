package com.jsz.sort;

/**
 * description:冒泡排序类
 * 最坏时间复杂度：O（n^2）
 * 元素比较的次数：（n-1）（n-2）+...+2+1=N^2/2-n/2
 * 元素交换的次数：（n-1）（n-2）+...+2+1=N^2/2-n/2
 * n^2-n
 *
 *
 *
 * @Author jsz
 * @Date 2022-10-26
 **/
public class Bubble {

    /**
     * 冒泡排序
     *
     * @param arr 数组arr
     */
    public static void sort(Comparable[] arr) {
        // 每行循环的个数
        for (int i = arr.length-1; i >0 ; i--) {
            // 每行循环的个数
            for (int j = 0; j < i; j++) {
                if (greater(arr[j], arr[j + 1])) {
                    exchange(arr, j, j + 1);
                }
            }

        }

    }


    /**
     * 比较大小
     *
     * @param a 数字a
     * @param b 数字b
     * @return
     */
    private static boolean greater(Comparable a, Comparable b) {
        return a.compareTo(b) > 0;
    }

    /**
     * 交换位置
     *
     * @param a 数组a
     * @param b 索引b
     * @param c 索引c
     */
    private static void exchange(Comparable[] a, int b, int c) {
        Comparable temp;
        temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
}
