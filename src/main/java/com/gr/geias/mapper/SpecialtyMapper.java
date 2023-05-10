package com.gr.geias.mapper;

import com.gr.geias.entity.Specialty;
import com.gr.geias.mapper.sqlProvider.SpecialtySqlProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Repository
@Component("mapper")
public interface SpecialtyMapper {
    /**
     * 获取专业信息
     *
     * @param collegeId 学院
     */
    @SelectProvider(type = SpecialtySqlProvider.class, method = "querySpecialty")
    List<Specialty> querySpecialty(@Param("collegeId") Integer collegeId);

    /**
     * 通过专业id 获取 学院id
     *
     * @param specialtyId 专业id
     */
    @Select("select college_id from specialty where specialty_id=#{specialtyId}")
    Integer queryCollegeId(@Param("specialtyId") Integer specialtyId);

    /**
     * 添加专业信息
     */
    @Insert("insert into specialty(specialty_name,create_time,college_id) values(#{specialty.specialtyName},#{specialty.createTime},#{specialty.collegeId})")
    Integer insertSpecialty(@Param("specialty") Specialty specialty);

    /**
     * 更新 专业
     */
    @Update("update specialty set specialty_name=#{specialty.specialtyName},college_id=#{specialty.collegeId} where specialty_id=#{specialty.specialtyId}")
    Integer updateSpecialty(@Param("specialty") Specialty specialty);

    /**
     * 删除专业
     */
    @Delete("delete from specialty where specialty_id = #{specialtyId}")
    Integer delSpecialty(@Param("specialtyId") Integer specialtyId);

    /**
     * 查询专业信息通过id
     */
    @Select("select * from specialty where specialty_id = #{specialtyId}")
    Specialty querySpecialtyById(@Param("specialtyId") Integer specialtyId);

    /**
     * 获取专业总人数
     */
    @Select("select n.sum from specialty s, organization_num n, clazz cg where s.specialty_id = cg.specialty_id and cg.class_id = n.class_id and s.specialty_id = #{specialtyId};")
    Integer[] queryCountSpecialty(@Param("specialtyId") Integer specialtyId);
}
