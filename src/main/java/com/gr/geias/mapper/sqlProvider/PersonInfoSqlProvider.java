package com.gr.geias.mapper.sqlProvider;

import com.gr.geias.entity.PersonInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public class PersonInfoSqlProvider {
    public static String updatePersonInfoById(@Param("personInfo") PersonInfo personInfo) {
        return new SQL() {{
            UPDATE("person_info");
            SET("person_name = #{personInfo.personName}");
            if (personInfo.getCollegeId() != null) {
                SET("college_id = #{personInfo.collegeId}");
            }
            SET("username = #{personInfo.username}");
            SET("password = #{personInfo.password}");
            WHERE("person_id = #{personInfo.personId}");
        }}.toString();

    }
}
