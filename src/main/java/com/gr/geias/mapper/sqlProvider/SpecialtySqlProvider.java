package com.gr.geias.mapper.sqlProvider;

import org.apache.ibatis.jdbc.SQL;

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
