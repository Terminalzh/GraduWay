package com.gr.geias.mapper;

import com.gr.geias.entity.EmploymentInformation;
import com.gr.geias.entity.PersonInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Repository
public interface EmploymentInformationMapper {
    /**
     * 分页查询信息
     *
     * @param info     查询条件
     * @param indexnum 从第几个开始
     * @param pagesize 每一页有多大
     * @param user     管理权限
     * @param salary   工资范围
     * @return 信息列表
     */
    List<EmploymentInformation> queryList(@Param("info") EmploymentInformation info,
                                          @Param("indexnum") int indexnum,
                                          @Param("pagesize") int pagesize,
                                          @Param("user") PersonInfo user,
                                          @Param("salary") Integer[] salary);

    List<EmploymentInformation> queryAll();


    /**
     * 统计查询总数
     *
     * @param info   查询
     * @param user   管理权限
     * @param salary 工资范围
     */
    Integer queryListCount(@Param("info") EmploymentInformation info,
                           @Param("user") PersonInfo user,
                           @Param("salary") Integer[] salary);

    /**
     * 插入毕业生信息
     *
     * @param employmentInformation 毕业生信息
     */
    Integer insertEmploymentInformation(@Param("info") EmploymentInformation employmentInformation);

    /**
     * 删除就业信息
     *
     * @param employmentInformation 毕业生信息
     */
    Integer delEmploymentInformation(@Param("info") EmploymentInformation employmentInformation);

    /**
     * 根据
     */
    @Select("select * from employment_information  where student_num=#{studentNum}")
    EmploymentInformation queryInfoByStudentNum(@Param("studentNum") Integer studentNum);

    /**
     * 更新毕业生信息
     */
    Integer updateInfo(@Param("info") EmploymentInformation employmentInformation);

    @Update("update employment_information set student_num = #{num} where information_id = #{id};")
    int updateStudentNum(@Param("num") int num, @Param("id") int id);
}
