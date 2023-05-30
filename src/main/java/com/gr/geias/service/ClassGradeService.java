package com.gr.geias.service;

import com.gr.geias.entity.ClassGrade;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public interface ClassGradeService {

    /**
     * 获取班级
     *
     * @param specialtyId 专业
     * @param adminId     管理
     */
    List<ClassGrade> getClassGrade(Integer specialtyId, Integer adminId);

    ClassGrade getClassGradeByClassId(Integer classId);

    /**
     * 添加班级和班级人数 并统计到学院和专业人数上
     */
    Boolean addClassGrade(ClassGrade classGrade, Integer sum, Integer collegeId);

    /**
     * 修改班级
     */
    Boolean updateClassGrade(ClassGrade classGrade, Integer sum, Integer college);

    /**
     * 删除班级信息
     */
    Boolean delClassGrade(Integer classId);
}
