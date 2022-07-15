package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 22:39:00
 * @leetcode 1587. Bank Account Summary II
 */
public class BankAccountSummaryII {
    String sql = "# Write your MySQL query statement below\n" +
            "select u.name as NAME, sum(t.amount) as BALANCE\n" +
            "from Users as u right join Transactions as t\n" +
            "on u.account=t.account\n" +
            "group by t.account\n" +
            "having sum(t.amount)>10000\n" +
            "\n";

    String sql_1 = "# Write your MySQL query statement below\n" +
            "select u.name as NAME, sum(t.amount) as BALANCE\n" +
            "from Users as u right join Transactions as t\n" +
            "on u.account=t.account\n" +
            "group by t.account\n" +
            "having BALANCE>10000\n" +
            "\n";

    String sql_2 = "# Write your MySQL query statement below\n" +
            "select u.name as NAME, temp.balance as BALANCE\n" +
            "from Users as u right join (\n" +
            "    select t.account, sum(t.amount) as balance\n" +
            "    from Transactions t\n" +
            "    group by t.account\n" +
            "    having sum(t.amount)>10000\n" +
            ") as temp on u.account=temp.account;\n" +
            "\n";


}
