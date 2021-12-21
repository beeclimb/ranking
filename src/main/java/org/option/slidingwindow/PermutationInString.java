package org.option.slidingwindow;

import java.util.Arrays;

/**
 * @author Jun
 * @date 2021/12/13
 * @leetcode 567. Permutation in String
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1CharCounts = new int[26];
        int[] s2SlidingWindowCharCount = new int[26];

        for (int i = 0; i < s1.length(); ++i) {
            ++s1CharCounts[s1.charAt(i) - 97];
            ++s2SlidingWindowCharCount[s2.charAt(i) - 97];
        }
        if (Arrays.equals(s1CharCounts, s2SlidingWindowCharCount)) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); ++i) {
            ++s2SlidingWindowCharCount[s2.charAt(i) - 97];
            --s2SlidingWindowCharCount[s2.charAt(i - s1.length()) - 97];
            if (Arrays.equals(s1CharCounts, s2SlidingWindowCharCount)) {
                return true;
            }
        }
        return false;
    }
}
