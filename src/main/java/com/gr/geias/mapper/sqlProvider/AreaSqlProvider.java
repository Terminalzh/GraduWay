package com.gr.geias.mapper.sqlProvider;

import com.gr.geias.entity.Area;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.jdbc.SQL;

public class AreaSqlProvider {
    public static String queryArea(@Param("area") Area area) {
        return new SQL() {{
            SELECT("area_id, area_name");
            FROM("area");
            if (area == null) {
                WHERE("parent_id is NULL");
            }
            if (area != null && area.getAreaId() != null) {
                WHERE("and area_id = #{area.areaId}");
            }
            if (area != null && area.getParentId() != null) {
                WHERE("and parent_id = #{area.parentId}");
            }
        }}.toString();
    }
}