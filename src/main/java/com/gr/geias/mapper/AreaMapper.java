package com.gr.geias.mapper;

import com.gr.geias.entity.Area;
import com.gr.geias.mapper.sqlProvider.AreaSqlProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Repository
public interface AreaMapper {
    /**
     * 获取地区信息
     */
    @SelectProvider(type = AreaSqlProvider.class, method = "queryArea")
    List<Area> queryArea(@Param("area") Area area);

    @Select("select * from area where area_id = #{areaId}")
    Area queryAreaByAreaId(@Param("areaId") Integer areaId);
}
