package com.gr.geias.service;

import com.gr.geias.entity.Specialty;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public interface SpecialtyService {
    /**
     * 获取专业
     * @param collegeId 学院
     * @return
     */
    List<Specialty> getSpecialty(Integer collegeId);

    /**
     * 添加专业
     * @param specialty 专业信息
     * @return
     */
    Boolean addSpecialty(Specialty specialty);

    /**
     * 更新专业信息
     * @param specialty
     * @return
     */
    Boolean updateSpecialty(Specialty specialty);

    /**
     * 删除专业信息
     * @param specialtyId
     * @return
     */
    Boolean delSpecialty(Integer specialtyId);

    /**
     * 通过专业id获取专业信息
     * @param specialtyId
     * @return
     */
    Specialty getSpecialtyById(Integer specialtyId);

    /**
     * 获取并持久化 专业人数
     * @param specialtyId
     * @return
     */
    Integer getAndSetSpecialtyCount(Integer specialtyId);

}
