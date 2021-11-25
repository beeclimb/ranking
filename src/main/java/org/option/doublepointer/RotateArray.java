package org.option.doublepointer;

import java.util.Arrays;

/**
 * @author Jun
 * @date 2021/11/25
 * @leetcode 189. Rotate Array
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] answer = new int[nums.length];
        int afterIndex;
        for (int beforeIndex = 0; beforeIndex < nums.length; ) {
            if (beforeIndex + k >= nums.length) {
                afterIndex = beforeIndex + k - nums.length;
            } else {
                afterIndex = beforeIndex + k;
            }
            answer[afterIndex] = nums[beforeIndex];
            ++beforeIndex;
        }
        System.arraycopy(answer, 0, nums, 0, nums.length);

    }

    public void rotate2(int[] nums, int k) {
        k = k % nums.length;
        int[] answer = new int[nums.length];
        int afterIndex;
        for (int beforeIndex = 0; beforeIndex < nums.length; ) {
            if (beforeIndex + k >= nums.length) {
                afterIndex = beforeIndex + k - nums.length;
            } else {
                afterIndex = beforeIndex + k;
            }
            answer[afterIndex] = nums[beforeIndex];
            ++beforeIndex;
        }
    }




}
