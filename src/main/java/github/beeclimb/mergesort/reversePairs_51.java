package github.beeclimb.mergesort;

/**
 * @date 2022/8/13 21:58
 * @leetcode 剑指 Offer 51. 数组中的逆序对
 */
public class reversePairs_51 {

    class Solution {
        int ans = 0;

        public int reversePairs(int[] nums) {
            if (nums == null || nums.length < 2) {
                return 0;
            }
            process(nums, 0, nums.length - 1);
            return ans;
        }

        public void merge(int[] arr, int left, int right, int mid) {
            int[] help = new int[right - left + 1];
            int l = left;
            int r = mid + 1;
            int i = 0;
            while (l <= mid && r <= right) {
                ans += arr[l] > arr[r] ? (right - r + 1) : 0;
                help[i++] = arr[l] > arr[r] ? arr[l++] : arr[r++];
            }
            while (l <= mid) {
                help[i++] = arr[l++];
            }
            while (r <= right) {
                help[i++] = arr[r++];
            }
            for (i = 0; i < help.length; ++i) {
                arr[i + left] = help[i];
            }
        }

        public void process(int[] arr, int left, int right) {
            if (left >= right) {
                return;
            }
            int mid = left + ((right - left) >> 1);
            process(arr, left, mid);
            process(arr, mid + 1, right);
            merge(arr, left, right, mid);
        }

    }

}
