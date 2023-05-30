package com.gr.geias.mapper;

import com.gr.geias.entity.ClassGrade;
import com.gr.geias.mapper.sqlProvider.ClassGradeSqlProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Repository
public interface ClassGradeMapper {
    /**
     * 查询班级
     *
     * @param specialtyId 根据专业
     * @param adminId     根据管理者
     */
    @SelectProvider(type = ClassGradeSqlProvider.class, method = "queryClassGrade")
    List<ClassGrade> queryClassGrade(@Param("specialtyId") Integer specialtyId, @Param("adminId") Integer adminId);

    /**
     * 获取 专业ID
     */
    @Select("select specialty_id from  clazz where class_id=#{classId}")
    Integer querySpecialtyById(@Param("classId") Integer classId);

    @Select("select * from  clazz where class_id=#{classId}")
    ClassGrade queryClassGradeById(@Param("classId") Integer classId);

    /**
     * 插入班级
     */
    @Insert("insert into clazz(class_name,specialty_id,create_time,admin_id) values(#{classGrede.className},#{classGrede.specialtyId},#{classGrede.createTime},#{classGrede.adminId})")
    @Options(useGeneratedKeys = true, keyProperty = "classId", keyColumn = "class_id")
    Integer insertClassGrade(@Param("classGrade") ClassGrade classGrade);

    /**
     * 更新班级信息
     */
    @Update("update clazz set class_name=#{classGrade.className},specialty_id=#{classGrade.specialtyId},admin_id=#{classGrade.adminId} where class_id=#{classGrade.classId}")
    Integer updateClassGradeById(@Param("classGrade") ClassGrade classGrade);

    /**
     * 删除班级信息
     */
    @Delete("delete from clazz where class_id = #{classId}")
    Integer deleteClassGradeById(@Param("classId") Integer classId);

}
