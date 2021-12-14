package org.option.slidingwindow;

import java.awt.image.renderable.RenderableImage;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Jun
 * @date 2021/12/13
 * @leetcode 567. Permutation in String
 */
public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        HashSet<Character> set1 = new HashSet<>(s1.length());
        for (int i = 0; i < s1.length(); i++) {
            set1.add(s1.charAt(i));
        }
        int left = 0, right = 0;
        Character rightValue;
        while (left < s2.length()) {
            while (right < left + s1.length() && right < s2.length()) {
                rightValue = s2.charAt(right);
                if (set1.contains(rightValue)) {
                    set1.remove(rightValue);
                    } else {
                        set2.clear();
                        ++left;
                        break;
                    }
                } else {
                    left = 2 * right - left + 1;
                    break;
                }
            }
            right = left;
        }
        return false;
    }
}
