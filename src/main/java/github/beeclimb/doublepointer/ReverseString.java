package github.beeclimb.doublepointer;

/**
 * @author Jun
 * @date 2021/12/7
 * @leetcode 344. Reverse String
 */
public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            swap(s, left++, right--);
        }

    }

    public void swap(char[] s, int leftIndex, int rightIndex) {
        char temp;
        temp = s[rightIndex];
        s[rightIndex] = s[leftIndex];
        s[leftIndex] = temp;
    }

}
