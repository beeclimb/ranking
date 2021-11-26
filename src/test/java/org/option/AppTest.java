package org.option;


import org.junit.Test;
import org.option.doublepointer.RotateArray;

import java.util.Arrays;


public class AppTest {
    @Test
    public void test() {
        int[] i = {1, 2, 3, 4, 5};
        int[] j = {1};
        new RotateArray().reverseArray(i, 0, i.length - 1);
        new RotateArray().reverseArray(i, 0, 1);
        new RotateArray().reverseArray(i, 2, i.length - 1);
        System.out.println(Arrays.toString(i));

    }

}
