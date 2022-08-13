package github.beeclimb.mergesort;

import java.util.Random;

/**
 * @date 2022/8/13 21:04
 * @leetcode 912. Sort an Array
 */
public class SortAnArray_912 {

    // 快排
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

    // 归并
    class Solution2 {
        public int[] sortArray(int[] nums) {
            process(nums, 0, nums.length - 1);
            return nums;
        }

        public void process(int[] arr, int l, int r) {
            if (l == r) {
                return;
            }
            int m = l + ((r - l) >> 1);
            process(arr, l, m);
            process(arr, m + 1, r);
            merge(arr, l, m, r);
        }

        public void merge(int[] arr, int l, int m, int r) {
            int[] help = new int[r - l + 1];
            int i = 0;
            int p1 = l;
            int p2 = m + 1;
            while (p1 <= m && p2 <= r) {
                help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
            }
            while (p1 <= m) {
                help[i++] = arr[p1++];
            }
            while (p2 <= r) {
                help[i++] = arr[p2++];
            }
            for (i = 0; i < (r - l + 1); ++i) {
                arr[l + i] = help[i];
            }
        }
    }
}
