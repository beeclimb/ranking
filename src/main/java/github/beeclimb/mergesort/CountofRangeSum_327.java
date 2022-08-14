package github.beeclimb.mergesort;

/**
 * @date 2022/8/14 15:30
 * @leetcode 327. Count of Range Sum
 */
public class CountofRangeSum_327 {

    class Solution {
        int ans = 0;

        public int countRangeSum(int[] nums, int lower, int upper) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            long[] preSum = new long[nums.length];
            preSum[0] = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                preSum[i] = preSum[i - 1] + nums[i];
            }
            process(preSum, 0, nums.length - 1, lower, upper);
            return ans;
        }

        public void process(long[] pre, int left, int right, int lower, int upper) {
            if (left >= right) {
                ans += ((lower <= pre[left]) && (pre[right] <= upper)) ? 1 : 0;
                return;
            }
            int mid = left + ((right - left) >> 1);
            process(pre, left, mid, lower, upper);
            process(pre, mid + 1, right, lower, upper);
            merge(pre, left, right, mid, lower, upper);
        }

        public void merge(long[] pre, int left, int right, int mid, int lower, int upper) {
            int winL = left;
            int winR = left;
            for (int j = mid + 1; j <= right; ++j) {
                long max = pre[j] - lower;
                long min = pre[j] - upper;
                while (winR <= mid && pre[winR] <= max) {
                    ++winR;
                }
                while (winL <= mid && pre[winL] < min) {
                    ++winL;
                }
                ans += (winR - winL);
            }
            int l = left;
            int r = mid + 1;
            int i = 0;
            long[] help = new long[right - left + 1];
            while (l <= mid && r <= right) {
                help[i++] = pre[l] <= pre[r] ? pre[l++] : pre[r++];
            }
            while (l <= mid) {
                help[i++] = pre[l++];
            }
            while (r <= right) {
                help[i++] = pre[r++];
            }
            for (i = 0; i < help.length; ++i) {
                pre[left + i] = help[i];
            }
        }
    }

}
