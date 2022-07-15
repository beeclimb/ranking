package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 23:43:00
 * @leetcode 1084. Sales Analysis III
 */
public class SalesAnalysisIII {
    String sql = "# Write your MySQL query statement below\n" +
            "select product_id, product_name\n" +
            "from Product inner join Sales\n" +
            "using(product_id)\n" +
            "group by product_id\n" +
            "having sum(sale_date between '2019-01-01' and '2019-03-31') = count(sale_date)\n";

    String sql_1 = "# Write your MySQL query statement below\n" +
            "select product_id, product_name\n" +
            "from Product \n" +
            "where product_id in (\n" +
            "    select distinct s.product_id\n" +
            "    from Sales as s\n" +
            "    group by s.product_id\n" +
            "    having max(sale_date) <= '2019-03-31'\n" +
            "    and min(sale_date) >= '2019-01-01'\n" +
            ");\n";


}
