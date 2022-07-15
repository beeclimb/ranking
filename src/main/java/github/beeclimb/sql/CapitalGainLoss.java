package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 17:36:00
 * @leetcode 1393. Capital Gain/Loss
 */
public class CapitalGainLoss {
    String sql = "# Write your MySQL query statement below\n" +
            "select stock_name,\n" +
            "sum(if(operation='Buy', -price, price)) as capital_gain_loss\n" +
            "from Stocks\n" +
            "group by stock_name;\n";

    String sql_1 = "# Write your MySQL query statement below\n" +
            "select stock_name,\n" +
            "sum(case operation when 'Buy' then -price else price end) as capital_gain_loss\n" +
            "from Stocks\n" +
            "group by stock_name;\n";

    String sql_2 = "# Write your MySQL query statement below\n" +
            "select stock_name,\n" +
            "sum(case when operation='Buy' then -price else price end) as capital_gain_loss\n" +
            "from Stocks\n" +
            "group by stock_name;\n";


}
