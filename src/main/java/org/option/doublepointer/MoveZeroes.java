package org.option.doublepointer;

/**
 * @author Jun
 * @date 2021/11/26
 * @leetcode 283. Move Zeroes
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int slow = 0, fast = 1;
        int temp;
        while (fast < nums.length) {
            if (nums[slow] == 0 && nums[fast] != 0) {
                temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                ++slow;
            } else if (nums[slow] != 0) {
                ++slow;
            }
            ++fast;
        }

    }
}
