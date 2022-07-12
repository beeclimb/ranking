package org.option;


import org.junit.Test;


public class AppTest {

    @Test
    public void appTest() {
        binary(3);
    }

    public static void binary(int number) {
        for (int i = 31; i >= 0; --i) {

            System.out.print((number & (1 << i)) == 0 ? "0" : "1");
        }
    }

}
