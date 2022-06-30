package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 14:27:00
 * @leetcode 511. Game Play Analysis I
 */
public class GamePlayAnalysisI {
    String sql = "select player_id, min(event_date) as first_login\n" +
            "from Activity\n" +
            "group by player_id";
}
