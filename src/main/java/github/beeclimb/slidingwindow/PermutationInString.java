package github.beeclimb.slidingwindow;

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

    public boolean checkInclusion2(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] window = new int[26];
        for (int i = 0; i < s1.length(); ++i) {
            --window[s1.charAt(i) - 97];
            ++window[s2.charAt(i) - 97];
        }
        int diff = 0;
        for (int i : window) {
            if (i != 0) {
                ++diff;
            }
        }
        if (diff == 0) {
            return true;
        }
        for (int i = s1.length(); i < s2.length(); ++i) {
            int in = s2.charAt(i) - 97;
            int out = s2.charAt(i - s1.length()) - 97;
            if (window[in] == 0) {
                ++diff;
            }
            ++window[in];
            if (window[in] == 0) {
                --diff;
            }
            if (window[out] == 0) {
                ++diff;
            }
            --window[out];
            if (window[out] == 0) {
                --diff;
            }
            if (diff == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInclusion3(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] window = new int[26];
        for (int i = 0; i <s1.length(); ++i) {
            --window[s1.charAt(i) - 97];
        }
        int left = 0;
        for (int right = 0; right < s2.length(); ++right) {
            int in = s2.charAt(right) - 97;
            ++window[in];
            while (window[in] > 0) {
                --window[s2.charAt(left) - 97];
                ++left;
            }
            if ((right - left + 1) == s1.length()) {
                return true;
            }
        }
        return false;
    }

}
