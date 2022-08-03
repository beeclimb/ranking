package github.beeclimb.binarysearch;

/**
 * @author Jun
 * @date 2021/11/24
 * @leetcode 35. Search Insert Position
 */
public class SearchInsertPosition_35 {
    /**
     * 找第一个大于等于 target 的下标
     */
    public int searchInsert(int[] nums, int target) {
        int left, right, reference, referencePoint;
        left = 0;
        right = nums.length - 1;
        while (left < right) {
            referencePoint = left + ((right - left) >> 1);
            reference = nums[referencePoint];
            if (target == reference) {
                return referencePoint;
            } else if (target < reference) {
                right = referencePoint - 1;
            } else {
                left = referencePoint + 1;
            }
        }
        return target > nums[left] ? ++left : left;

    }

}
