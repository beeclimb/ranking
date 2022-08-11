package github.beeclimb.quicksort;

import java.util.Random;

/**
 * @date 2022/8/11
 * @leetcode 75. Sort Colors
 */
public class SortColors_75 {

    class Solution {
        public void sortColors(int[] nums) {
            process(nums, 0, nums.length - 1);
        }

        public int[] partition(int[] arr, int left, int right) {
            int l = left - 1;
            int r = right;
            int cur = left;
            int random = (new Random().nextInt(right - left + 1)) + left;
            swap(arr, random, right);
            while (cur < r) {
                if (arr[cur] < arr[right]) {
                    swap(arr, cur, l + 1);
                    ++l;
                    ++cur;
                } else if (arr[cur] > arr[right]) {
                    swap(arr, cur, r - 1);
                    --r;
                } else {
                    ++cur;
                }
            }
            swap(arr, right, r);
            return new int[]{l, r + 1};
        }

        public void swap(int[] arr, int l, int r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }

        public void process(int[] arr, int left, int right) {
            if (left >= right) {
                return;
            }
            int[] help = partition(arr, left, right);
            process(arr, left, help[0]);
            process(arr, help[1], right);
        }
    }


}
