package com.gr.geias.service;

import com.gr.geias.dto.EmploymentInformationMsg;
import com.gr.geias.dto.EmploymentLogin;
import com.gr.geias.entity.EmploymentInformation;
import com.gr.geias.entity.PersonInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public interface EmploymentInformationService {
    /**
     * 查找毕业生信息
     *
     * @param information 查询信息
     * @param pagenum     页码
     * @param personInfo  用户权限
     * @param salary      工资区间
     * @return
     */
    EmploymentInformationMsg getEmploymentInfoList(
            EmploymentInformation information,
            Integer pagenum,
            PersonInfo personInfo,
            Integer[] salary
    );

    /**
     * 根据给出的信息查询数量
     *
     * @param information 信息
     * @param personInfo  用户权限
     * @return
     */
    Integer getCount(EmploymentInformation information, PersonInfo personInfo, Integer[] salary);

    /**
     * 添加 毕业生就业信息
     *
     * @param employmentInformation
     * @return
     */
    Integer addEmploymentInfo(EmploymentInformation employmentInformation);

    /**
     * 得到 毕业生就业信息 通过 学号
     *
     * @param studentNum 学号
     * @return
     */
    EmploymentInformation getInfoByStudentNum(Integer studentNum);

    /**
     * 更新 毕业生就业信息
     *
     * @param employmentInformation
     * @return
     */
    Integer updateInfo(EmploymentInformation employmentInformation);

    int addEmploymentLogin(EmploymentLogin employmentLogin);

    EmploymentLogin queryEmploymentLoginByStudentNum(int studentNum);

    List<EmploymentLogin> queryAllEmploymentLogin();
}
