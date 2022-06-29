package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/29 15:13:00
 * @leetcode 1965. Employees With Missing Information
 */
public class EmployeesWithMissingInformation {
    String sql = "select employee_id\n" +
            "from (select employee_id from Employees union all select employee_id from Salaries) as temp\n" +
            "group by employee_id\n" +
            "having count(employee_id)=1\n" +
            "order by employee_id;";

    String sql_1 = "select e.employee_id from Employees e left join Salaries s on e.employee_id=s.employee_id where salary is null\n" +
            "union \n" +
            "select s.employee_id from Employees e right join Salaries s on e.employee_id=s.employee_id where name is null\n" +
            "order by employee_id;";

}
