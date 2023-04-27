package com.gr.geias.mapper;

import com.gr.geias.entity.Specialty;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author maotentai
 * @since 2020-03-06
 */
@Repository
@Component("mapper")
public interface SpecialtyMapper {
    /**
     * 获取专业信息
     *
     * @param collegeId 学院
     * @return
     */
    List<Specialty> querySpecialty(@Param("collegeId") Integer collegeId);

    /**
     * 通过专业id 获取 学院id
     *
     * @param specialtyId 专业id
     * @return
     */
    @Select("select college_id from specialty where specialty_id=#{specialtyId}")
    Integer queryCollegeId(@Param("specialtyId") Integer specialtyId);

    /**
     * 添加专业信息
     *
     * @param specialty
     * @return
     */
    Integer insertSpecialty(@Param("specialty") Specialty specialty);

    /**
     * 更新 专业
     *
     * @param specialty 信息
     * @return
     */
    @Update("update specialty set specialty_name=#{specialty.specialtyName},college_id=#{specialty.collegeId} where specialty_id=#{specialty.specialtyId}")
    Integer updateSpecialty(@Param("specialty") Specialty specialty);

    /**
     * 删除专业
     *
     * @param specialtyId
     * @return
     */
    @Delete("delete from specialty where specialty_id = #{specialtyId}")
    Integer delSpecialty(@Param("specialtyId") Integer specialtyId);

    /**
     * 查询专业信息通过id
     *
     * @param specialtyId
     * @return
     */
    @Select("select * from specialty where specialty_id = #{specialtyId}")
    Specialty querySpecialtyById(@Param("specialtyId") Integer specialtyId);

    /**
     * 获取专业总人数
     *
     * @param specialtyId
     * @return
     */
    @Select("select n.sum from specialty s, organization_num n, clazz cg where s.specialty_id = cg.specialty_id and cg.class_id = n.class_id and s.specialty_id = #{specialtyId};")
    Integer[] queryCountSpecialty(@Param("specialtyId") Integer specialtyId);
}
