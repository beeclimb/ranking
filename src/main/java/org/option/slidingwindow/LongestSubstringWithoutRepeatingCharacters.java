package org.option.slidingwindow;

import java.util.HashMap;

/**
 * @author Jun
 * @date 2021/12/8
 * @leetcode 3. Longest Substring Without Repeating Characters
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> slidingWindowMap = new HashMap<>(10);
        int left = 0, right = 0, longest = 0;
        while (right < c.length) {
            if (slidingWindowMap.containsKey(c[right])) {
                int newLeft = slidingWindowMap.get(c[right]) + 1;
                for (int i = left; i < newLeft; i++) {
                    slidingWindowMap.remove(c[i]);
                }
            }
            slidingWindowMap.put(c[right], right);
            longest = Math.max(slidingWindowMap.size(), longest);
            ++right;
        }
        return longest;
    }
}
