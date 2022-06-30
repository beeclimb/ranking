package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 15:01:00
 * @leetcode 1741. Find Total Time Spent by Each Employee
 */
public class FindTotalTimeSpentByEachEmployee {
    String sql = "select event_day as day, emp_id, sum(out_time-in_time) as total_time\n" +
            "from Employees\n" +
            "group by emp_id, event_day;";
}
