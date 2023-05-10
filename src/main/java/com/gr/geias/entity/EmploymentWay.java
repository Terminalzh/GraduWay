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
public class EmploymentWay implements Serializable {

    private Integer employmentWayId;

    private String vayName;

    private Date createTime;


}
