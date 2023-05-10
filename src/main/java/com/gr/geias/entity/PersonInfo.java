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
public class PersonInfo implements Serializable {

    private Integer personId;

    private Integer enableStatus;

    private String personName;

    private Date createTime;

    private String password;

    private String username;

    private Integer collegeId;

    private String faceToken;

}
