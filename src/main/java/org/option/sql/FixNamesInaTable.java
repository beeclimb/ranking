package org.option.sql;

/**
 * @author majun
 * @date 2022/6/29 13:39:00
 * @leetcode 1667. Fix Names in a Table
 */
public class FixNamesInaTable {
    String sql = "select user_id,\n" +
            "concat(upper(left(name, 1)), lower(substring(name, 2))) name \n" +
            "from Users\n" +
            "order by user_id;";

    String sql_1 = "select user_id,\n" +
            "insert(lcase(name), 1, 1, ucase(ucase(substring(name, 1, 1)))) name \n" +
            "from Users\n" +
            "order by user_id;";

}
