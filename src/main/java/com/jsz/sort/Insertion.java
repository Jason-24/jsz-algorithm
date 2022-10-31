package com.jsz.sort;

/**
 * description: 插入排序
 * 最坏情况：
 * 比较次数：（n-1）（n-2）+...+2+1=N^2/2-n/2
 * 交换次数：（n-1）（n-2）+...+2+1=N^2/2-n/2
 * 总的是N^2-N
 *
 *
 * @Author jsz
 * @Date 2022-10-31
 **/
public class Insertion {
    /**
     * 插入排序
     *
     * @param arr 数组arr
     */
    public static void sort(Comparable[] arr) {
        // 每行循环的个数
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (greater(arr[j], arr[j - 1])) {
                    exchange(arr, j-1, j);
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
     * @param i 索引i
     * @param j 索引j
     */
    private static void exchange(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
