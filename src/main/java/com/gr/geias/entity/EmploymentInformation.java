package com.gr.geias.entity;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Data
public class EmploymentInformation implements Serializable {

    private Integer informationId;

    private Integer studentNum;

    private String name;

    private ClassGrade classGrade;

    private Area area;

    private UnitKind unitKind;

    private String salary;

    private EmploymentWay employmentWay;

    private String msg;

    private Date createTime;

    private College college;

    private Specialty specialty;

    private Integer gender;

}
