package org.option.doublepointer;

/**
 * @author Jun
 * @date 2021/12/2
 * @leetcode 167. Two Sum II - Input Array Is Sorted
 */
public class TwoSumInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int findOne, twoIndex, oneIndex = -1;
        do {
            findOne = numbers[++oneIndex];
            twoIndex = findTwo(numbers, ++oneIndex, numbers.length - 1, target - findOne);
        } while (twoIndex == -1);

        return new int[]{++oneIndex, ++twoIndex};
    }

    public int findTwo(int[] array, int startIndex, int endIndex, int target) {
        int leftPoint, rightPoint, referencePoint;
        leftPoint = startIndex;
        rightPoint = endIndex;
        while (leftPoint <= rightPoint) {
            referencePoint = startIndex + ((endIndex - startIndex) >> 1);
            if (target == array[referencePoint]) {
                return referencePoint;
            } else if (target > array[referencePoint]) {
                leftPoint = ++referencePoint;
            } else {
                rightPoint = --referencePoint;
            }
        }

    }

}
