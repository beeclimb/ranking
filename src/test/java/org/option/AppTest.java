package org.option;


import org.junit.Test;
import org.option.doublepointer.MoveZeroes;
import org.option.doublepointer.ReverseString;
import org.option.doublepointer.ReverseWordsInStringIII;
import org.option.doublepointer.TwoSumInputArrayIsSorted;
import org.option.slidingwindow.LongestSubstringWithoutRepeatingCharacters;
import org.option.slidingwindow.PermutationInString;

import java.util.Arrays;


public class AppTest {
    @Test
    public void test() {
        String s1 =  "abcdxabcde";
        String s2 =    "abcdeabcdx";

        System.out.println(new PermutationInString().checkInclusion(s1, s2));


    }

}
