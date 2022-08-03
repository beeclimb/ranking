package github.beeclimb.binarysearch;

/**
 * @author Jun
 * @date 2021/11/22
 * @leetcode 704. Binary Search
 */
public class BinarySearch_704 {
    public int search(int[] nums, int target) {
        int length, head, tail, referencePoint, reference;
        head = 0;
        tail = nums.length - 1;
        do {
            length = tail - head + 1;
            if (length % 2 != 0) {
                reference = nums[referencePoint = (head + tail) / 2];
                if (target == reference) {
                    return referencePoint;
                } else if (target < reference) {
                    tail = referencePoint;
                } else {
                    head = referencePoint;
                }
            } else {
                if (target == nums[head]) {
                    return head;
                }
                head++;
            }
            if (head == tail && nums[head] != target) {
                head = -1;
            }
        } while (head != -1);

        return head;
    }

    /**
     * 经典二分
     * 边界条件：head <= tail
     */
    public int search1(int[] nums, int target) {
        int head = 0;
        int tail = nums.length - 1;
        while (head <= tail) {
            int mid = (tail - head) / 2 + head;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        return -1;
    }
}
