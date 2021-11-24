package org.option.binarysearch;

/**
 * @author Jun
 * @date 2021/11/23
 * @leetcode 278. First Bad Version
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left, right, referencePoint;
        left = 0;
        right = n - 1;
        while (left <= right) {
            referencePoint = left + ((right - left) >> 1);
            if (isBadVersion(referencePoint + 1)) {
                if (!isBadVersion(referencePoint)) {
                    return referencePoint;
                } else 

            } else ()
        }


    }

    public boolean isBadVersion(int version) {
        return true;
    }
}
