package com.gr.geias.mapper;

import com.gr.geias.entity.UnitKind;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Repository
public interface UnitKindMapper {
    /**
     * 查询工作分类
     */
    @Select("select * from unit_kind")
    List<UnitKind> queryUnitKind();

    @Select("select * from unit_kind where unit_id = #{unitId} ;")
    UnitKind queryUnitKindByUnKindId(@Param("unitId") Integer unitId);
}
