package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/24 16:39:00
 * @leetcode 1757. Recyclable and Low Fat Products
 */
public class RecyclableAndLowFatProducts {
    String sql = "select product_id from Products where low_fats='Y' and recyclable='Y';";
    String sql_1 = "select c.Name as Customers \n" +
                "from Customers as c\n" +
                "left join Orders as o on c.Id = o.CustomerId\n" +
                "where o.Id is null";
}
