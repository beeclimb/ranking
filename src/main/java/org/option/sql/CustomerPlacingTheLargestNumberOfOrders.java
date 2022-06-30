package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 14:09:00
 * @leetcode 586. Customer Placing the Largest Number of Orders
 */
public class CustomerPlacingTheLargestNumberOfOrders {
    String sql = "# Write your MySQL query statement below\n" +
            "select customer_number from (\n" +
            "    select customer_number, count(customer_number) as cn\n" +
            "    from Orders\n" +
            "    group by customer_number\n" +
            "    order by count(customer_number) desc    \n" +
            ") as temp\n" +
            "limit 0, 1\n";

    String sql_1 = "# Write your MySQL query statement below\n" +
            "select customer_number\n" +
            "from Orders\n" +
            "group by customer_number\n" +
            "order by count(customer_number) desc\n" +
            "limit 0, 1\n";


}
