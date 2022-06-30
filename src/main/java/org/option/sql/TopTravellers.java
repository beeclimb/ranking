package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 18:10:00
 * @leetcode 1407. Top Travellers
 */
public class TopTravellers {
    String sql = "# Write your MySQL query statement below\n" +
            "select u.name, COALESCE(temp.distance, 0) as travelled_distance\n" +
            "from Users as u left join (\n" +
            "    select user_id, sum(r.distance) as distance\n" +
            "    from Rides as r\n" +
            "    group by r.user_id\n" +
            ") as temp on u.id=temp.user_id\n" +
            "order by temp.distance desc, u.name\n";

    String sql_1 = "# Write your MySQL query statement below\n" +
            "select u.name, COALESCE(sum(r.distance), 0) as travelled_distance\n" +
            "from Users as u left join Rides as r on u.id=r.user_id\n" +
            "group by u.id\n" +
            "order by travelled_distance desc, u.name\n" +
            "\n";

    String sql_2 = "# Write your MySQL query statement below\n" +
            "select u.name, if(sum(r.distance) is null, 0, sum(r.distance)) as travelled_distance\n" +
            "from Users as u left join Rides as r on u.id=r.user_id\n" +
            "group by u.id\n" +
            "order by travelled_distance desc, u.name\n" +
            "\n";

    String sql_3 = "# Write your MySQL query statement below\n" +
            "select u.name, if(temp.distance is null, 0, temp.distance) as travelled_distance\n" +
            "from Users as u left join (\n" +
            "    select user_id, sum(r.distance) as distance\n" +
            "    from Rides as r\n" +
            "    group by r.user_id\n" +
            ") as temp on u.id=temp.user_id\n" +
            "order by temp.distance desc, u.name\n" +
            "\n";


}
