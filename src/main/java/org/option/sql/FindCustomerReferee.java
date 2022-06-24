package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/24 17:11:00
 * @leetcode 584. Find Customer Referee
 */
public class FindCustomerReferee {
    String sql = "select name from customer where referee_id is null or referee_id != 2;";
    String sql_1 = "select name from customer where not referee_id <=> 2;";
    String sql_2 = "select name from customer where referee_id != 2\n" +
                    "union all\n" +
                    "select name from customer where referee_id is null;";
}
