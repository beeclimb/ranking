package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 11:49:00
 * @leetcode 1729. Find Followers Count
 */
public class FindFollowersCount {
    String sql = "select user_id, count(follower_id) as followers_count\n" +
            "from Followers\n" +
            "group by user_id\n" +
            "order by user_id;";
}
