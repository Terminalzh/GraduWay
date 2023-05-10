package com.gr.geias.dto;

import com.gr.geias.entity.EmploymentInformation;
import lombok.Data;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Data
public class EmploymentInformationMsg {
    private Boolean success;
    private List<EmploymentInformation> list;
    private Integer count;
}
