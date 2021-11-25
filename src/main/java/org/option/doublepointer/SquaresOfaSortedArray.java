package org.option.doublepointer;

import java.util.Arrays;

/**
 * @author Jun
 * @date 2021/11/24
 * @leetcode 977. Squares of a Sorted Array
 */
public class SquaresOfaSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] answer = new int[nums.length];
        for (int index = nums.length - 1, i = 0, j = nums.length - 1; i <= j; ) {
            if (nums[i] * nums[i] > nums[j] * nums[j]) {
                answer[index] = nums[i] * nums[i];
                ++i;
            } else {
                answer[index] = nums[j] * nums[j];
                --j;
            }
            --index;
        }
        return answer;

    }

    public int[] sortedSquares2(int[] nums) {
        int negative = -1;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] < 0) {
                negative = i;
            } else {
                break;
            }
        }

        int i = negative, j = negative + 1, index = 0;
        int[] answer = new int[nums.length];
        while (i >= 0 || j < nums.length) {
            if (i < 0) {
                answer[index] = nums[j] * nums[j];
                ++j;
            } else if (j >= nums.length) {
                answer[index] = nums[i] * nums[i];
                --i;
            } else if (nums[i] * nums[i] < nums[j] * nums[j]) {
                answer[index] = nums[i] * nums[i];
                --i;
            } else {
                answer[index] = nums[j] * nums[j];
                ++j;
            }
            ++index;
        }
        return answer;

    }

    public int[] sortedSquares1(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = nums[i] * nums[i];
        }
        Arrays.sort(answer);
        return answer;

    }

}
