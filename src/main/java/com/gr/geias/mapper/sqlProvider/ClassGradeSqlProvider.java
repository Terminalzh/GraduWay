package com.gr.geias.mapper.sqlProvider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class ClassGradeSqlProvider {
    public static String queryClassGrade(@Param("specialtyId") Integer specialtyId, @Param("adminId") Integer adminId) {
        return new SQL() {{
            SELECT("*");
            FROM("clazz");
            if (specialtyId != null) {
                WHERE("specialty_id = #{specialtyId}");
            }
            if (adminId != null) {
                WHERE("adminId = #{adminId}");
            }
        }}.toString();
    }
}