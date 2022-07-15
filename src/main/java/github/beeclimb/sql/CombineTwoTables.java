package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/29 18:10:00
 * @leetcode 175. Combine Two Tables
 */
public class CombineTwoTables {
    String sql = "select firstName, lastName, city, state\n" +
            "from Person p left join Address a on p.personId=a.personId;";

}
