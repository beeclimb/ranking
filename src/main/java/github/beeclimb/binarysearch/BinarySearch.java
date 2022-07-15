package github.beeclimb.binarysearch;

/**
 * @author Jun
 * @date 2021/11/22
 * @leetcode 704. Binary Search
 */
public class BinarySearch {
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

}
