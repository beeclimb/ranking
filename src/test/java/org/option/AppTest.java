package org.option;


import org.junit.Test;
import org.option.doublepointer.MoveZeroes;
import org.option.doublepointer.TwoSumInputArrayIsSorted;

import java.util.Arrays;


public class AppTest {
    @Test
    public void test() {
        int[] i = {-1, 0};
        System.out.println(Arrays.toString(new TwoSumInputArrayIsSorted().twoSum(i, -1)));

    }

}
