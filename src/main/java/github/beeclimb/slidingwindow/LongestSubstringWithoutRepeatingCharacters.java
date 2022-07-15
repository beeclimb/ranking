package github.beeclimb.slidingwindow;

import javax.xml.stream.events.Characters;
import java.util.HashMap;
import java.util.HashSet;

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
                left = newLeft;
            }
            slidingWindowMap.put(c[right], right);
            longest = Math.max(slidingWindowMap.size(), longest);
            ++right;
        }
        return longest;
    }

    public int lengthOfLongestSubstring2(String s) {
        HashMap<Character, Integer> slidingWindowMap = new HashMap<>(10);
        int left = 0, right, longest = 0;
        Character rightValue;
        for (right = 0; right < s.length(); right++) {
            rightValue = s.charAt(right);
            if (slidingWindowMap.containsKey(rightValue)) {
                left = Math.max(slidingWindowMap.get(rightValue) + 1, left);
            }
            slidingWindowMap.put(rightValue, right);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
