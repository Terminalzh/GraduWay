package com.gr.geias.mapper;

import com.gr.geias.entity.ClassGrade;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020-03-06 09:33
 */@Repository
public interface ClassGradeMapper  {
    /**
     * 查询班级
     * @param specialtyId 根据专业
     * @param adminId 根据管理者
     * @return
     */
    List<ClassGrade> queryClassGrade(@Param("specialtyId") Integer specialtyId,@Param("adminId") Integer adminId);

    /**
     * 获取 专业ID
     * @param classId 班级id
     * @return
     */
    @Select("select specialty_id from  clazz where class_id=#{classId}")
    Integer queryspecialtyId(@Param("classId") Integer classId);

    /**
     * 插入班级
     * @param classGrade
     * @return
     */
    Integer insertClassGrede(@Param("classGrede") ClassGrade classGrade);

    /**
     * 更新班级信息
     * @param classGrade
     * @return
     */
    @Update("update clazz set class_name=#{classGrade.className},specialty_id=#{classGrade.specialtyId},admin_id=#{classGrade.adminId} where class_id=#{classGrade.classId}")
    Integer updateClassGrede(@Param("classGrade") ClassGrade classGrade);

    /**
     * 删除班级信息
     * @param classId
     * @return
     */
    @Delete("delete from clazz where class_id = #{classId}")
    Integer delClassGrede(@Param("classId")Integer classId);

}
