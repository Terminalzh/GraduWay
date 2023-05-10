package com.gr.geias.dto;

import com.gr.geias.entity.College;
import com.gr.geias.entity.PersonInfo;
import lombok.Data;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Data
public class CollegeAndPerson {
    private College college;
    private PersonInfo personInfo;
    private Integer sum;
}
