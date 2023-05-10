package com.gr.geias.mapper.sqlProvider;

import org.apache.ibatis.jdbc.SQL;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public class SpecialtySqlProvider {
    public String querySpecialty(Integer collegeId) {
        return new SQL() {{
            SELECT("*");
            FROM("specialty");
            if (collegeId != null) {
                WHERE("college_id = #{collegeId}");
            }
        }}.toString();
    }
}
