package com.gr.geias.mapper.sqlProvider;

import com.gr.geias.entity.PersonInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class PersonInfoSqlProvider {
    public static String updatePersonInfoById(@Param("person") PersonInfo personInfo) {
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