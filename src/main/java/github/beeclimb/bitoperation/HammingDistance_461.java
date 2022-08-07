package github.beeclimb.bitoperation;

/**
 * @date 2022/8/7 18:11
 * @leetcode 461. Hamming Distance
 */
public class HammingDistance_461 {

    public int hammingDistance(int x, int y) {
        int ans = 0;
        int sum = x ^ y;
        for (int i = 0; i < 32; ++i) {
            if ((sum & (1 << i)) != 0) {
                ++ans;
            }
        }
        return ans;
    }

    public int hammingDistance1(int x, int y) {
        int ans = 0;
        int sum = x ^ y;
        while (sum != 0) {
            ans += (sum & 1);
            sum >>= 1;
        }
        return ans;
    }

    // 清除最右边的1: x & (x - 1)
    public int hammingDistance2(int x, int y) {
        int ans = 0;
        int sum = x ^ y;
        while (sum != 0) {
            sum &= (sum - 1);
            ++ans;
        }
        return ans;
    }

}
