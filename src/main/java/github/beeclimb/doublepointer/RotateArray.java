package github.beeclimb.doublepointer;

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
        int loopCount = gcd(nums.length, k);
        for (int startPosition = 0; startPosition < loopCount; ++startPosition) {
            int tempValue, previousValue, currentPoint, nextPoint;
            currentPoint = startPosition;
            previousValue = nums[currentPoint];
            do {
                nextPoint = (currentPoint + k) % nums.length;
                tempValue = nums[nextPoint];
                nums[nextPoint] = previousValue;
                previousValue = tempValue;
                currentPoint = nextPoint;
            } while (currentPoint != startPosition);

        }
    }

    public int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    public void rotate3(int[] nums, int k) {
        k = k % nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    public void reverseArray(int[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex + 1;
        int threshold = (length >> 1) - 1;
        int temp, j;
        for (int i = 0; i <= threshold; ) {
            j = length - 1 - i;
            temp = array[j + startIndex];
            array[j + startIndex] = array[i + startIndex];
            array[i + startIndex] = temp;
            ++i;
        }

    }

}
