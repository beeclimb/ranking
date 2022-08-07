package github.beeclimb.binarysearch;

/**
 * @author jun.ma
 * @date 2022/8/7 9:21
 * @leetcode 374. Guess Number Higher or Lower
 */
public class GuessNumberHigherOrLower_374 {

    int guess(int num) {
        return 0;
    }

    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int m = 1;
        while (l <= r) {
            m = ((r - l) >> 1) + l;
            int temp = guess(m);
            if (temp == 0) {
                return m;
            } else if (temp == 1) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return m;
    }
}
