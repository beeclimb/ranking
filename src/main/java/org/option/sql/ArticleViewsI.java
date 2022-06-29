package org.option.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 7:52:00
 * @leetcode 1148. Article Views I
 */
public class ArticleViewsI {
    String sql = "select distinct author_id as id\n" +
            "from Views\n" +
            "where author_id=viewer_id\n" +
            "order by author_id;";
}
