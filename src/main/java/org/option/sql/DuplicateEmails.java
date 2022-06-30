package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 22:12:00
 * @leetcode 182. Duplicate Emails
 */
public class DuplicateEmails {
    String sql = "# Write your MySQL query statement below\n" +
            "select distinct p1.Email as Email\n" +
            "from Person as p1 inner join Person as p2\n" +
            "on p1.Id != p2.Id and p1.Email=p2.Email\n";

    String sql_1 = "# Write your MySQL query statement below\n" +
            "select Email\n" +
            "from Person\n" +
            "group by Email\n" +
            "having count(Email) > 1;\n";


}
