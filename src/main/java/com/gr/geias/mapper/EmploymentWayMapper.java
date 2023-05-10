package com.gr.geias.mapper;

import com.gr.geias.entity.EmploymentWay;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Terminal
 * @since 2023-05-06
 */@Repository
public interface EmploymentWayMapper  {
    /**
     * 获取工作来源
     */
    @Select("select * from employment_way")
    List<EmploymentWay> queryEmploymentWay();

}
