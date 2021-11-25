package org.option;


import org.junit.Test;
import org.option.doublepointer.RotateArray;


public class AppTest {
    @Test
    public void test() {
        int[] i = {-4,-1,0,3,10};
        int[] j = {1};
        new RotateArray().rotate(i, 11);
        System.out.println(new RotateArray().gcd(2, 6));

    }

}
