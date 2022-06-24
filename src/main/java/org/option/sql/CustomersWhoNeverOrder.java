package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/24 17:43:00
 * @leetcode 183. Customers Who Never Order
 */
public class CustomersWhoNeverOrder {
    String sql = "select name as 'Customers' from Customers where Id not in (\n" +
                "    select CustomerId from Orders\n" +
                ");";

    String sql_1 = "select name as 'Customers' from Customers left join Orders on Customers.Id = Orders.CustomerId\n" +
                "where Orders.CustomerId is null;";
    

}
