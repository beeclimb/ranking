package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 22:11:00
 * @leetcode 1050. Actors and Directors Who Cooperated At Least Three Times
 */
public class ActorsAndDirectorsWhoCooperatedAtLeastThreeTimes {
    String sql = "select actor_id, director_id \n" +
            "from ActorDirector\n" +
            "group by actor_id, director_id\n" +
            "having count(director_id)>=3;";
}
