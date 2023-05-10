package com.gr.geias.mapper.sqlProvider;

import com.gr.geias.entity.College;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class CollegeSqlProvider {
    public static String queryCollegeByAdminId(@Param("adminId") Integer adminId) {
        return new SQL() {{
            SELECT("*");
            FROM("college");
            if (adminId != null) {
                WHERE("admin_id = #{adminId}");
            }
        }}.toString();
    }

    public String updateCollege(College college) {
        return new SQL() {{
            UPDATE("college");
            if (college.getCollegeName() != null) {
                SET("college_name = #{college.collegeName}");
            }
            if (college.getAdminId() != null) {
                SET("admin_id = #{college.adminId}");
            }
            WHERE("college_id = #{college.collegeId}");
        }}.toString();
    }
}
