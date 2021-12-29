package org.option;


import org.junit.Test;
import org.option.depthbreadth.FloodFill;
import org.option.depthbreadth.MaxAreaOfIsland;
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
        int[][] a = new int[][] {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };


//        System.out.println(new MaxAreaOfIsland().maxAreaOfIsland3(a));
        System.out.println(new MaxAreaOfIsland().maxAreaOfIsland2(a));

    }

    @Test
    public void fTest() {
        System.out.println(f(5));
    }

    public int f(int n) {
        if (n == 1) {
            return 1;
        }
        return f(n - 1) + 1;
    }
}
