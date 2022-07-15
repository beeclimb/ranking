package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/29 17:44:00
 * @leetcode 176. Second Highest Salary
 */
public class SecondHighestSalary {
    String sql = "select(select distinct salary from Employee order by salary desc limit 1, 1) as SecondHighestSalary;";

    String sql_1 = "select ifnull ((select distinct salary from Employee order by salary desc limit 1, 1), null) as SecondHighestSalary;";

    String sql_2 = "select max(salary) as SecondHighestSalary\n" +
            "from Employee\n" +
            "where salary < (select max(salary) from Employee);";
}
