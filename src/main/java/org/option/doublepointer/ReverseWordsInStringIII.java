package org.option.doublepointer;

/**
 * @author Jun
 * @date 2021/12/7
 * @leetcode 557. Reverse Words in a String III
 */
public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        String separator = " ";
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : s.split(separator)) {
            char[] c = string.toCharArray();
            reverseString(c);
            stringBuilder.append(String.valueOf(c));
            stringBuilder.append(separator);
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

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

    public String reverseWords2(String s) {
        String separator = " ";
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();

        int lastIndex = 0, temp = 0, j = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isWhitespace(chars[i])) {
                temp = i;
                while (temp >= lastIndex) {
                    stringBuilder.append(chars[temp--]);
                }
                lastIndex = i + 1;
            }
        }
        temp = chars.length - 1;
        stringBuilder.append(separator);
        while (temp >= lastIndex) {
            stringBuilder.append(chars[temp--]);
        }
        stringBuilder.deleteCharAt(0);
        return stringBuilder.toString();
    }

}
