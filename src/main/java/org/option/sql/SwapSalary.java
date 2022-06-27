package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/27 18:53:00
 * @leetcode 627. Swap Salary
 */
public class SwapSalary {
    String sql = "update Salary set sex=\n" +
            "case sex when 'm' then 'f' \n" +
            "else 'm' end";
    String sql_1 = "update Salary set sex= \n" +
            "if(sex='m', 'f', 'm');";
    String sql_2 = "update Salary set sex= \n" +
            "char(ascii('m') + ascii('f') - ascii(sex));";
    
}
