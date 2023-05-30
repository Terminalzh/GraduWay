package com.gr.geias.mapper.sqlProvider;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public class ClassGradeSqlProvider {
    public static String queryClassGrade(@Param("specialtyId") Integer specialtyId, @Param("adminId") Integer adminId) {
        return new SQL() {{
            SELECT("*");
            FROM("clazz");
            if (specialtyId != null) {
                WHERE("specialty_id = #{specialtyId}");
            }
            if (adminId != null) {
                WHERE("admin_id = #{adminId}");
            }
        }}.toString();
    }
}
