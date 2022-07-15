package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/29 16:26:00
 * @leetcode 608. Tree Node
 */
public class TreeNode {
    String sql = "# Write your MySQL query statement below\n" +
            "select id, case when p_id is null then 'Root'\n" +
            "when id in (select p_id from tree) then 'Inner'\n" +
            "else 'Leaf' end as type\n" +
            "from tree\n" +
            "order by id;\n";

    String sql_1 = "select id, case when p_id is null then 'Root'\n" +
            "when id not in (select ifnull(p_id, 0) from tree) then 'Leaf'\n" +
            "else 'Inner' end as type\n" +
            "from tree\n" +
            "order by id;";

    String sql_2 = "select id, 'Root' as type from tree where p_id is null\n" +
            "union\n" +
            "select id, 'Leaf' as type from tree where id not in (select distinct p_id from tree where p_id is not null) and p_id is not null\n" +
            "union\n" +
            "select id, 'Inner' as type from tree where id in (select distinct p_id from tree where p_id is not null) and p_id is not null\n" +
            "order by id;";

    String sql_3 = "select id,\n" +
            "if(p_id is null, 'Root', if(id in (select p_id from tree), 'Inner', 'Leaf')) as type\n" +
            "from tree\n" +
            "order by id;";

    String sql_4 = "select distinct t1.id,\n" +
            "(case when t1.p_id is null then 'Root'\n" +
            "when t2.p_id is null then 'Leaf'\n" +
            "else 'Inner' end) as type\n" +
            "from tree t1 left join tree t2\n" +
            "on t1.id=t2.p_id\n" +
            "order by t1.id;";


}
