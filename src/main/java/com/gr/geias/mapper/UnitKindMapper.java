package com.gr.geias.mapper;

import com.gr.geias.entity.UnitKind;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author maotentai
 * @since 2020-03-06
 */@Repository
public interface UnitKindMapper {
    /**
     * 查询工作分类
     * @return
     */
    @Select("select * from unit_kind")
    List<UnitKind> queryUnitKind();

}
