package com.jsz.sort.senior;

/**
 * description:希尔排序
 *
 * @Author jsz
 * @Date 2022-10-31
 **/
public class Shell {

    /**
     * 希尔排序
     *
     * @param arr 数组arr
     */
    public static void sort(Comparable[] arr) {
        // 确定增长量的值
        int h = 1;
        while (h < arr.length / 2) {
            h = h * 2 + 1;
        }
        while (h>=1){
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (!greater(arr[j], arr[j - h])) {
                        exchange(arr, j, j - h);
                    } else {
                        break;
                    }
                }
            }
            h=h/2;
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
