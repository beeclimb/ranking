package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/21 22:00:00
 * @leetcode 595. Big Countries
 */
public class BigCountries {
    String sql_595 = "select name, population, area from World where area >= 3000000 or population >= 25000000;";
    String sql_595_2 =
            "select name, population, area from World where area >= 3000000 \n" +
            "union\n" +
            "select name, population, area from World where population >= 25000000;";


}
