package org.option;


import org.junit.Test;
import org.option.doublepointer.MoveZeroes;
import org.option.doublepointer.ReverseString;
import org.option.doublepointer.TwoSumInputArrayIsSorted;

import java.util.Arrays;


public class AppTest {
    @Test
    public void test() {
        char[] s = {'h','e','l','l','o'};
        new ReverseString().reverseString(s);
        System.out.println(Arrays.toString(s));

    }

}
