package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/29 18:37:00
 * @leetcode 1581. Customer Who Visited but Did Not Make Any Transactions
 */
public class CustomerWhoVisitedbutDidNotMakeAnyTransactions {
    String sql = "select customer_id, count(v.customer_id) as count_no_trans\n" +
            "from Visits v left join Transactions t on v.visit_id=t.visit_id\n" +
            "where t.transaction_id is null\n" +
            "group by v.customer_id;";

    String sql_1 = "select v.customer_id, count(v.customer_id) as count_no_trans\n" +
            "from Visits v\n" +
            "where visit_id not in \n" +
            "(select distinct visit_id from Transactions)\n" +
            "group by v.customer_id";
}
