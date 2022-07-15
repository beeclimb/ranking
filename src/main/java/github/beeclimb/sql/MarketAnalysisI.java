package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 21:37:00
 * @leetcode 1158. Market Analysis I
 */
public class MarketAnalysisI {
    String sql = "# Write your MySQL query statement below\n" +
            "select u.user_id as buyer_id, u.join_date, COALESCE(count(o.buyer_id), 0) as orders_in_2019\n" +
            "from Users as u left join Orders as o\n" +
            "on u.user_id=o.buyer_id and year(o.order_date)=2019\n" +
            "group by u.user_id\n" +
            "\n";

    String sql_1 = "# Write your MySQL query statement below\n" +
            "select user_id as buyer_id, join_date, ifnull(temp.order_in_2019, 0) as orders_in_2019\n" +
            "from Users as u left join(\n" +
            "    select o.buyer_id, count(o.buyer_id) as order_in_2019\n" +
            "    from Orders as o\n" +
            "    where year(o.order_date)=2019\n" +
            "    group by o.buyer_id    \n" +
            ") as temp on u.user_id=temp.buyer_id\n";

}
