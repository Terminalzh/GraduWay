package com.gr.geias.mapper;

import com.gr.geias.entity.College;
import com.gr.geias.mapper.sqlProvider.CollegeSqlProvider;
import org.apache.ibatis.annotations.*;
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
public interface CollegeMapper {
    /**
     * 获取学院
     */
    @SelectProvider(type = CollegeSqlProvider.class, method = "queryCollegeByAdminId")
    List<College> queryCollegeByAdminId(@Param("adminId") Integer adminId);

    /**
     * 添加 学院
     */
    @Insert(
            "insert into college(college_name,create_time,admin_id)" +
            " values(#{college.collegeName},#{college.createTime},#{college.adminId})"
    )
    @Options(useGeneratedKeys = true, keyColumn = "college_id", keyProperty = "collegeId")
    int addCollege(@Param("college") College college);

    /**
     * 查询学院下面一共有多少人
     *
     * @param collegeId 学院id
     */
    @Select(
            "select " +
            "SUM(n.sum)" +
            "from  college c, " +
            "specialty s, " +
            "organization_num n, " +
            "clazz cg " +
            "where c.college_id = s.college_id " +
            "and s.specialty_id = cg.specialty_id " +
            "and cg.class_id = n.class_id " +
            "and c.college_id=#{collegeId}"
    )
    Integer queryCollegeCountById(@Param("collegeId") Integer collegeId);

    /**
     * 更新学院信息
     *
     * @param college 学院信息
     */
    @UpdateProvider(type = CollegeSqlProvider.class, method = "updateCollege")
    Integer updateCollege(@Param("college") College college);

    /**
     * 根据学院id查学院
     *
     * @param collegeId 学院id
     */
    @Select("select * from college where college_id=#{collegeId}")
    College queryCollegeById(@Param("collegeId") Integer collegeId);

    /**
     * 删除学院信息
     *
     * @param collegeId 学院id
     */
    @Delete("DELETE FROM college WHERE college_id = #{collegeId}")
    Integer deleteCollegeById(@Param("collegeId") Integer collegeId);
}
