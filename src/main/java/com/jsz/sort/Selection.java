package com.jsz.sort;

/**
 * description:选择排序类
 * 最坏时间复杂度：O（n^2）
 * 元素比较的次数：（n-1）（n-2）+...+2+1=N^2/2-n/2
 * 元素交换的次数：n-1
 * n^2/2+n/2-1
 *
 * @Author jsz
 * @Date 2022-10-26
 **/
public class Selection {

    /**
     * 选择排序
     *
     * @param arr 数组arr
     */
    public static void sort(Comparable[] arr) {
        // 每行循环的个数
        for (int i = 0; i < arr.length - 1; i++) {
            // 记录最小索引
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (greater(arr[index], arr[j])) {
                   index=j;
                }
            }
            exchange(arr,i,index);

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
