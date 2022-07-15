package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 11:31:00
 * @leetcode 1141. User Activity for the Past 30 Days I
 */
public class UserActivityForThePast30DaysI {
    String sql = "select activity_date as day, count(distinct user_id) as active_users\n" +
                "from Activity where datediff('2019-07-27', activity_date) < 30 and datediff('2019-07-27', activity_date) >= 0\n" +
                "group by activity_date\n" +
                "order by activity_date;";

}
