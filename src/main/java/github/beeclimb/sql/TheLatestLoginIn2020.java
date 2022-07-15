package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 14:44:00
 * @leetcode 1890. The Latest Login in 2020
 */
public class TheLatestLoginIn2020 {
    String sql = "select user_id, max(time_stamp) as last_stamp\n" +
            "from Logins\n" +
            "where year(time_stamp)='2020'\n" +
            "group by user_id;";

    String sql_1 = "# Write your MySQL query statement below\n" +
            "select user_id, max(time_stamp) as last_stamp\n" +
            "from Logins\n" +
            "where time_stamp regexp '^2020'\n" +
            "group by user_id;\n";

}
