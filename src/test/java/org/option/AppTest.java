package org.option;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.option.binarysearch.BinarySearch;
import org.option.binarysearch.FirstBadVersion;
import org.option.binarysearch.SearchInsertPosition;

public class AppTest {
    @Test
    public void test() {
        int[] i = {1, 3, 5, 7, 9};
        int[] j = {1};
        System.out.println(new SearchInsertPosition().searchInsert(i, 100));
    }
}
