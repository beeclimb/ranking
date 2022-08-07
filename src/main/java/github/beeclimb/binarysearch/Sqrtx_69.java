package github.beeclimb.binarysearch;

/**
 * @author jun.ma
 * @date 2022/8/7 8:34
 * @leetcode 69. Sqrt(x)
 */
public class Sqrtx_69 {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int ans = (int) Math.exp(0.5 * (Math.log(x)));
        return (long) (ans + 1) * (ans + 1) <= x ? ans + 1 : ans;
    }

    public int mySqrt1(int x) {
        int l = 0;
        int r = x;
        int m = 0;
        int ans = 0;
        while (l <= r) {
            // + 优先级比 >> 高
            m = ((r - l) >> 1) + l;
            // 防止精度丢失，转成long
            if ((long) m * m <= x) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }
}
