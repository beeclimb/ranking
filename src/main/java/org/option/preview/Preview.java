package org.option.preview;

import java.util.Arrays;

/**
 * @author jun.ma
 * @date 2022/7/14 7:08:00
 */
public class Preview {

    /**
     * 打印数的二进制
     */
    static void printBinary(int number) {
        for (int i = 31; i >= 0; --i) {
            System.out.print((number & (1 << i)) == 0 ? "0" : "1");
        }
    }

    static void selectionSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int n = array.length;
        // 确定这次排哪个位置的数
        for (int i = 0; i < n - 1; ++i) {
            // 最小数的指针
            int minIndex = i;
            // 从要排的那个数后一位，开始往后遍历，确定出最小数的位置
            for (int j = i + 1; j < n; ++j) {
                minIndex = array[minIndex] < array[j] ? minIndex : j;
            }
            swap(array, i, minIndex);
        }
    }

    static void bubbleSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int n = array.length;
        // 从第一位开始，两两依次比较，确定最大的数放最后面, 从后往前排
        for (int i = n - 1; i > 0; --i) {
            for (int j = 1; j <= i; ++j) {
                if (array[j - 1] > array[j]) {
                    swap(array, j, j - 1);
                }
            }
        }
    }

    static void insertionSort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int n = array.length;
        // 1. 排第一位； 2. 排1，2位  3. 排1，2，3位...
        for (int i = 1; i < n; ++i) {
            // 和前一位比大小，不能越界
            for (int j = i; j - 1 >= 0 && array[j] < array[j - 1]; --j) {
                swap(array, j, j - 1);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**
     * 前缀和数组
     */
    static void rangeSum(int[] array, int l, int r) {
        int[] preSum = new int[array.length];

        // 前缀和数组
        preSum[0] = array[0];
        for (int i = 1; i < preSum.length; ++i) {
            preSum[i] = preSum[i - 1] + array[i];
        }
        System.out.println(Arrays.toString(preSum));
        // 返回array, [l, r]范围内的和, 默认l <= r
        System.out.println(l == 0 ? preSum[r] : preSum[r] - preSum[l - 1]);
    }

    /**
     * 对数器
     * 返回一个数组arr，arr长度[0,maxLen-1],arr中的每个值[0,maxValue-1]
     */
    public static int[] lenRandomValueRandom(int maxLen, int maxValue) {
        int len = (int) (Math.random() * maxLen);
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            ans[i] = (int) (Math.random() * maxValue);
        }
        return ans;
    }

    public static void main(String[] args) {
        int testTime = 100;
        for (int i = 0; i < testTime; ++i) {
            int maxLen = 30;
            int maxValue = 100;
            int[] a = lenRandomValueRandom(maxLen, maxValue);
            int[] b = new int[a.length];
            int[] c = new int[a.length];
            System.out.println(Arrays.toString(a));
            System.arraycopy(a, 0, b, 0, a.length);
            System.arraycopy(a, 0, c, 0, a.length);
            selectionSort(a);
            bubbleSort(b);
            insertionSort(c);

            System.out.println(Arrays.equals(a, b));
            System.out.println(Arrays.equals(a, c));

        }
    }

}
