package com.gr.geias.mapper.sqlProvider;

import com.gr.geias.entity.Area;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public class AreaSqlProvider {
    public static String queryArea(Area area) {
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
