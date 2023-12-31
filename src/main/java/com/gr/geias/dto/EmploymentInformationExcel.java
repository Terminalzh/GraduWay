package com.gr.geias.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Data
public class EmploymentInformationExcel implements Serializable {
    @ExcelProperty("Id")
    private Integer informationId;
    @ExcelProperty("学号")
    private Integer studentNum;
    @ExcelProperty("姓名")
    private String name;
    @ExcelProperty("性别")
    private String gender;
    @ExcelProperty("学院")
    private String collegeName;
    @ExcelProperty("专业")
    private String specialtyName;
    @ExcelProperty("班级")
    private String className;
    @ExcelProperty("就职地区")
    private String areaName;
    @ExcelProperty("职业属性")
    private String unitName;
    @ExcelProperty("就业途径")
    private String wayName;
    @ExcelProperty("工资")
    private String salary;
    @ExcelProperty("录入时间")
    private Date createTime;
    @ExcelProperty("信息")
    private String msg;
}
