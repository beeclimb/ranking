package github.beeclimb.binarysearch;

/**
 * @date 2022/8/7 9:32
 * @leetcode 33. Search in Rotated Sorted Array
 */
public class SearchInRotatedSortedArray_33 {

    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0;
        int r = n - 1;
        int m = 0;
        while (l <= r) {
            m = ((r - l) >> 1) + l;
            if (target == nums[m]) {
                return m;
            }
            if (nums[m] >= nums[0]) {
                if (nums[0] <= target && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (nums[m] < target && target <= nums[n - 1]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }

    public int binary(int[] nums, int target, int l, int r) {
        while (l <= r) {
            int m = (l + r) >> 1;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    public int find(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int temp = 0;
        if (nums[l] < nums[r]) {
            return nums.length - 1;
        }
        while (l <= r) {
            int m = (l + r) >> 1;
            if (nums[m] > nums[l]) {
                l = m;
            } else if (nums[m] < nums[l]) {
                r = m;
            } else {
                return m;
            }
        }
        return -1;
    }

    // 单独两次二分
    public int search1(int[] nums, int target) {
        if (target >= nums[0]) {
            return binary(nums, target, 0, find(nums));
        } else {
            return binary(nums, target, find(nums) + 1, nums.length - 1);
        }
    }
}
