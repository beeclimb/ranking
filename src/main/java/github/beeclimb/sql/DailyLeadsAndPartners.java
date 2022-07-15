package github.beeclimb.sql;

/**
 * @author jun.ma
 * @date 2022/6/30 11:42:00
 * @leetcode 1693. Daily Leads and Partners
 */
public class DailyLeadsAndPartners {
    String sql = "select date_id, make_name, count(distinct lead_id) as unique_leads, count(distinct partner_id) as unique_partners\n" +
            "from DailySales\n" +
            "group by date_id, make_name;";

}
