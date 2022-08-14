package github.beeclimb.mergesort;

/**
 * @date 2022/8/11 8:37
 * @leetcode 493. Reverse Pairs
 */
public class ReversePairs_493 {

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
            int k = mid + 1;
            for (int j = left; j <= mid; ++j) {
                while (k <= right && (long) arr[j] > ((long) arr[k] << 1)) {
                    ++k;
                }
                ans += (k - mid - 1);
            }
            while (l <= mid && r <= right) {
                help[i++] = arr[l] <= arr[r] ? arr[l++] : arr[r++];
            }
            while (l <= mid) {
                help[i++] = arr[l++];
            }
            while (r <= right) {
                help[i++] = arr[r++];
            }
            for (i = 0; i < help.length; ++i) {
                arr[left + i] = help[i];
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
