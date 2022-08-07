package github.beeclimb.bitoperation;

/**
 * @date 2022/8/7 17:02
 * @leetcode 136. Single Number
 */
public class SingleNumber_136 {

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }
}
