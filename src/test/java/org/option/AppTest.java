package org.option;


import org.junit.Test;
import org.option.depthbreadth.FloodFill;
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
        int[][] array = new int[][]{
                {0, 0, 0},
                {0, 1, 1}
        };

        System.out.println(Arrays.deepToString(new FloodFill().floodFill(array, 1, 1, 1)));


    }

}
