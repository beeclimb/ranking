package org.option;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.option.doublepointer.RotateArray;
import org.option.doublepointer.SquaresOfaSortedArray;

import java.util.Arrays;

public class AppTest {
    @Test
    public void test() {
        int[] i = {-4,-1,0,3,10};
        int[] j = {1};
        new RotateArray().rotate(i, 11);
    }
}
