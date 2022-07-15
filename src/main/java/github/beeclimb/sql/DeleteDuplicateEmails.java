package github.beeclimb.sql;

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

    String sql_1 = "delete p1 from Person p1 inner join Person p2 on p1.email=p2.email where p1.id > p2.id;";

}
