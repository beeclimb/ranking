package github.beeclimb;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class AppTest {

    @Test
    public void appTest() {
        ArrayList<Integer> nums = new ArrayList<>(10);
        Integer[] numsInt = nums.toArray(new Integer[0]);
    }

    public void swap(int[] arr, int l, int r) {
        arr[l] = arr[l] ^ arr[r];
        arr[r] = arr[l] ^ arr[r];
        arr[l] = arr[l] ^ arr[r];
    }
}
