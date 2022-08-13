package github.beeclimb.preview;

import java.util.Random;

/**
 * @author jun.ma
 * @date 2022/8/6 17:58
 */
public class QuickSort {
    public void process(int[] arr, int L, int R) {
        if (L >= R) {
            return;
        }
        int lessR = L - 1;
        int moreL = R;
        int cur = L;
        while (cur < moreL) {
            // < 区间
            if (arr[cur] < arr[R]) {
                swap(arr, cur++, ++lessR);
                // > 区间
            } else if (arr[cur] > arr[R]) {
                swap(arr, cur, --moreL);
                // = 区间
            } else {
                ++cur;
            }
        }
        swap(arr, R, moreL);
        process(arr, L, lessR);
        process(arr, cur + 1, R);
    }

    // for test
    static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public void quickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        process(arr, 0, arr.length - 1);
    }
}

class Solution {
    public int[] sortArray(int[] nums) {
        process(nums, 0, nums.length - 1);
        return nums;
    }

    public int[] partition(int[] arr, int left, int right) {
        // 随机选一个作为我们的主元
        int i = new Random().nextInt(right - left + 1) + left;
        swap(arr, right, i);
        int l = left - 1;
        int r = right;
        int cur = left;
        while (cur < r) {
            if (arr[cur] < arr[right]) {
                swap(arr, l + 1, cur);
                ++l;
                ++cur;
            } else if (arr[cur] > arr[right]) {
                swap(arr, r - 1, cur);
                --r;
            } else {
                ++cur;
            }
        }
        swap(arr, r, right);
        return new int[]{l, r + 1};
    }

    public void process(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int[] temp = partition(arr, left, right);
        process(arr, left, temp[0]);
        process(arr, temp[1], right);
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
