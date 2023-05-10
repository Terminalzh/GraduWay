package com.gr.geias.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Data
public class ClassGrade implements Serializable {

    private Integer classId;

    private String className;

    private Integer specialtyId;

    private Date createTime;

    private Integer adminId;


}
