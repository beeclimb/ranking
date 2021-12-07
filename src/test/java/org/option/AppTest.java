package org.option;


import org.junit.Test;
import org.option.doublepointer.MoveZeroes;
import org.option.doublepointer.ReverseString;
import org.option.doublepointer.ReverseWordsInStringIII;
import org.option.doublepointer.TwoSumInputArrayIsSorted;

import java.util.Arrays;


public class AppTest {
    @Test
    public void test() {
        String s = "Let's take LeetCode contest";
        System.out.println(new ReverseWordsInStringIII().reverseWords(s));
        System.out.println(new ReverseWordsInStringIII().reverseWords2(s));


    }

}
