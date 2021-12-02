package org.option;


import org.junit.Test;
import org.option.doublepointer.MoveZeroes;
import org.option.doublepointer.TwoSumInputArrayIsSorted;

import java.util.Arrays;


public class AppTest {
    @Test
    public void test() {
        int[] i = {-1, 0};
        int[] i1 = {2,7,11,15};
        int[] i2 = {5,25,75};
        System.out.println(Arrays.toString(new TwoSumInputArrayIsSorted().twoSum(i2, 100)));

    }

}
