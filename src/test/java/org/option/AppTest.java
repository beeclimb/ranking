package org.option;


import org.junit.Test;
import org.option.doublepointer.MoveZeroes;

import java.util.Arrays;


public class AppTest {
    @Test
    public void test() {
        int[] i = {1, 0, 3, 4, 5, 0, 0, 0, 6, 9, 11, 0, 100};
        new MoveZeroes().moveZeroes(i);
        System.out.println(Arrays.toString(i));

    }

}
