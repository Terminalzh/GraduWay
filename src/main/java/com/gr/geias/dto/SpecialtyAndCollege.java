package com.gr.geias.dto;

import com.gr.geias.entity.College;
import com.gr.geias.entity.Specialty;
import lombok.Data;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Data
public class SpecialtyAndCollege {
    private Specialty specialty;
    private College college;
    private Integer sum;
}
