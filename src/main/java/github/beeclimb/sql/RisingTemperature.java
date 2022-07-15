package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 9:57:00
 * @leetcode 197. Rising Temperature
 */
public class RisingTemperature {
    String sql = "select w2.id \n" +
            "from Weather w1 left join Weather w2\n" +
            "on datediff(w1.recordDate, w2.recordDate) = -1\n" +
            "where w2.Temperature > w1.Temperature";

}
