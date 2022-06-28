package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/28
 * @leetcode 196. Delete Duplicate Emails
 */
public class DeleteDuplicateEmails {
    String sql = "DELETE p1 FROM Person p1,\n" +
            "    Person p2\n" +
            "WHERE\n" +
            "    p1.Email = p2.Email AND p1.Id > p2.Id";
}
