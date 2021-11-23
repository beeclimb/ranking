package org.option;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.option.binarysearch.BinarySearch;

public class AppTest {
    @Test
    public void test() {
        int[] numbers = {2,5};
        int target = 2;
        int result = new BinarySearch().search(numbers, target);
        System.out.println(result);
    }
}
