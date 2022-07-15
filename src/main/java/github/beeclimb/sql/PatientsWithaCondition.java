package github.beeclimb.sql;

/**
 * @author majun
 * @date 2022/6/29 14:52:00
 * @leetcode 1527. Patients With a Condition
 */
public class PatientsWithaCondition {
    String sql = "select patient_id, patient_name, conditions\n" +
            "from Patients\n" +
            "where conditions regexp('^DIAB1|\\\\sDIAB1');";

}
