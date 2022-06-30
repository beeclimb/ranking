package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 11:05:00
 * @leetcode 607. Sales Person
 */
public class SalesPerson {
    String sql = "# Write your MySQL query statement below\n" +
            "select s.name\n" +
            "from SalesPerson as s left join Orders as o on s.sales_id=o.sales_id\n" +
            "left join Company as c on c.com_id=o.com_id\n" +
            "group by s.name\n" +
            "having sum(if(c.name='RED', 1, 0))=0\n" +
            "order by s.sales_id;\n";

    String sql_1 = "# Write your MySQL query statement below\n" +
            "select name from SalesPerson as s where s.sales_id not in (\n" +
            "    select o.sales_id\n" +
            "    from Orders as o left join Company as c on o.com_id=c.com_id\n" +
            "    where c.name='RED' \n" +
            ")\n";

    String sql_2 = "# Write your MySQL query statement below\n" +
            "select name from SalesPerson where name not in (\n" +
            "    select s.name\n" +
            "    from Orders as o left join Company c on c.com_id=o.com_id\n" +
            "    left join SalesPerson s on o.sales_id=s.sales_id\n" +
            "    where c.name='RED'    \n" +
            ")\n";

    String sql_3 = "# Write your MySQL query statement below\n" +
            "select name from SalesPerson where sales_id not in (\n" +
            "    select sales_id from Orders where com_id = (\n" +
            "        select com_id from Company where name='RED'    \n" +
            "    )    \n" +
            ")\n" +
            "\n";

}
