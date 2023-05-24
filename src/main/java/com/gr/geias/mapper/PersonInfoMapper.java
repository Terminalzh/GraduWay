package com.gr.geias.mapper;

import com.gr.geias.entity.PersonInfo;
import com.gr.geias.mapper.sqlProvider.PersonInfoSqlProvider;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Repository
public interface PersonInfoMapper {
    /**
     * 登录
     *
     * @param username 用户名
     * @param password 秘密
     * @return 用户
     */
    @Select("select * from person_info where username=#{username} and password=#{password} ")
    PersonInfo queryPerson(@Param("username") String username, @Param("password") String password);

    /**
     * 根据id查询人员
     */
    @Select("select * from person_info where person_id=#{personId} ")
    PersonInfo queryPersonById(@Param("personId") Integer personId);

    /**
     * 查询学院管理
     */
    @Select("select person_id,person_name from person_info where enable_Status=1 and college_id is NULL")
    List<PersonInfo> queryCollegePerson();

    /**
     * 更新用户所属学院
     */
    @Update("update person_info set college_id=#{personInfo.collegeId} where person_id = #{personInfo.personId}")
    Integer updateCollegeIdByPersonId(@Param("personInfo") PersonInfo personInfo);

    /**
     * 查询 一个学院里所有的老师
     */
    @Select("select * from person_info where enable_Status=0 and college_id=#{collegeId}")
    List<PersonInfo> queryPersonByCollegeId(@Param("collegeId") Integer collegeId);

    /**
     * 删除一个学院的的全部老师
     */
    @Delete("delete from person_info where college_id=#{collegeId}")
    Integer deletePersonByCollegeId(@Param("collegeId") Integer collegeId);

    /**
     * 添加人员
     */
    @Insert("insert into person_info(enable_Status,person_name,create_time,password,username,college_id) values(#{person.enableStatus},#{person.personName},#{person.createTime},#{person.password},#{person.username},#{person.collegeId})")
    Integer insertPerson(@Param("person") PersonInfo personInfo);

    /**
     * 更新人员信息
     */
    @UpdateProvider(type = PersonInfoSqlProvider.class, method = "updatePersonInfoById")
    Integer updatePersonInfoById(@Param("personInfo") PersonInfo personInfo);

    /**
     * 删除用户
     */
    @Delete("delete from person_info where person_id=#{personId}")
    Integer deletePersonById(@Param("personId") Integer personId);

    /**
     * 获取 权限为1的的用户
     */
    @Select("select * from person_info where enable_Status =1")
    List<PersonInfo> queryPerson1();

    @Update("/*update person_info set face_token = #{faceToken} where person_id = #{personId}*/")
    Integer updatePersonById(@Param("personId") Integer personId, @Param("faceToken") String faceToken);
}

