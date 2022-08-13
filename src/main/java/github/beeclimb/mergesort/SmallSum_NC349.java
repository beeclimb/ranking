package github.beeclimb.mergesort;

import java.util.ArrayList;

/**
 * @date 2022/8/12 18:35
 * @nowcoder NC349 计算数组的小和
 */
public class SmallSum_NC349 {

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param nums int整型ArrayList
         * @return long长整型
         */
        public long ans = 0L;

        public long calArray(ArrayList<Integer> nums) {
            if (nums == null || nums.size() < 2) {
                return 0L;
            }
            int[] ints = new int[nums.size()];
            for (int i = 0; i < nums.size(); ++i) {
                ints[i] = nums.get(i);
            }
            process(ints, 0, ints.length - 1);
            return ans;
        }

        public void merge(int[] arr, int left, int mid, int right) {
            int[] help = new int[right - left + 1];
            int l = left;
            int r = mid + 1;
            int i = 0;
            while (l <= mid && r <= right) {
                ans += (arr[l] <= arr[r] ? (right - r + 1) * arr[l] : 0L);
                help[i++] = arr[l] <= arr[r] ? arr[l++] : arr[r++];
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

        public void process(int[] arr, int l, int r) {
            if (l >= r) {
                return;
            }
            int m = l + ((r - l) >> 1);
            process(arr, l, m);
            process(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}
