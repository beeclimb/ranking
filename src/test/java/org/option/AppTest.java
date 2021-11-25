package org.option;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.option.doublepointer.SquaresOfaSortedArray;

import java.util.Arrays;

public class AppTest {
    @Test
    public void test() {
        int[] i = {-4,-1,0,3,10};
        int[] j = {1};
        System.out.println(Arrays.toString(new SquaresOfaSortedArray().sortedSquares2(i)));
    }
}
