package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/29 14:15:00
 * @leetcode 1484. Group Sold Products By The Date
 */
public class GroupSoldProductsByTheDate {
    String sql = "select sell_date,\n" +
            "count(distinct(product)) num_sold,\n" +
            "group_concat(distinct(product)) products\n" +
            "from Activities\n" +
            "group by sell_date\n" +
            "order by sell_date;";
}
