package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/25 22:54:00
 * @leetcode 1873. Calculate Special Bonus
 */
public class CalculateSpecialBonus {
    String sql = "select employee_id, \n" +
            "case when MOD(employee_id, 2)=1 \n" +
            "and name not regexp '^M' then salary else 0 end as bonus \n" +
            "from Employees order by employee_id;";

}
