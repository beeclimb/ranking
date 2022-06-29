package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/29
 * @leetcode 1795. Rearrange Products Table
 */
public class RearrangeProductsTable {
    String sql = "select product_id,\n" +
            "'store1' as store,\n" +
            "store1 as price\n" +
            "from Products where store1 is not null\n" +
            "union all\n" +
            "select product_id,\n" +
            "'store2' as store,\n" +
            "store2 as price\n" +
            "from Products where store2 is not null\n" +
            "union all \n" +
            "select product_id,\n" +
            "'store3' as store,\n" +
            "store3 as price\n" +
            "from Products where store3 is not null";

}
