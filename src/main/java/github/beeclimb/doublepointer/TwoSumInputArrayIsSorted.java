package github.beeclimb.doublepointer;

/**
 * @author Jun
 * @date 2021/12/2
 * @leetcode 167. Two Sum II - Input Array Is Sorted
 */
public class TwoSumInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int one, twoIndex, oneIndex = -1;
        do {
            one = numbers[++oneIndex];
            twoIndex = findTwo(numbers, oneIndex + 1, numbers.length - 1, target - one);
        } while (twoIndex == -1);

        return new int[]{++oneIndex, ++twoIndex};
    }

    public int findTwo(int[] array, int startIndex, int endIndex, int target) {
        int leftPoint, rightPoint, referencePoint = -1;
        leftPoint = startIndex;
        rightPoint = endIndex;
        while (leftPoint <= rightPoint) {
            referencePoint = leftPoint + ((rightPoint - leftPoint) >> 1);
            if (target == array[referencePoint]) {
                return referencePoint;
            } else if (target > array[referencePoint]) {
                leftPoint = ++referencePoint;
            } else {
                rightPoint = --referencePoint;
            }
        }
        return -1;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] > target) {
                --right;
            } else {
                ++left;
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSum3(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1, referencePoint;
        while (left < right) {
            referencePoint = left + ((right - left) >> 1);
            if (numbers[left] + numbers[referencePoint] > target) {
                right = --referencePoint;
            } else if (numbers[right] + numbers[referencePoint] < target) {
                left = ++referencePoint;
            } else if (numbers[left] + numbers[right] > target) {
                --right;
            } else if (numbers[left] + numbers[right] < target){
                ++left;
            } else {
                return new int[] {left + 1, right + 1};
            }

        }
        return new int[] {-1, -1};
    }
    
}
