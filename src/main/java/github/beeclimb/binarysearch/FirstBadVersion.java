package github.beeclimb.binarysearch;

/**
 * @author Jun
 * @date 2021/11/23
 * @leetcode 278. First Bad Version
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left, right, reference = 0;
        left = 1;
        right = n;
        while (left <= right) {
            reference = left + ((right - left) >> 1);
            if (isBadVersion(reference)) {
                if (!isBadVersion(reference - 1) || reference == 1) {
                    return reference;
                } else {
                    right = reference - 1;
                }
            } else {
                if (isBadVersion(reference + 1)) {
                    return reference + 1;
                } else {
                    left = reference + 1;
                }
            }
        }
        return reference + 1;
    }

    public int officialFirstBadVersion(int n) {
        int left, right, reference;
        left = 1;
        right = n;
        while (left < right) {
            reference = left + ((right - left) >> 1);
            if (isBadVersion(reference)) {
                right = reference;
            } else {
                left = reference + 1;
            }
        }
        return left;
    }

    public boolean isBadVersion(int version) {
        return true;
    }

}
