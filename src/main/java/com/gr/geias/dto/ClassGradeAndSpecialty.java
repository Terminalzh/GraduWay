package com.gr.geias.dto;

import com.gr.geias.entity.ClassGrade;
import com.gr.geias.entity.PersonInfo;
import com.gr.geias.entity.Specialty;
import lombok.Data;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Data
public class ClassGradeAndSpecialty {
    private ClassGrade classGrade;
    private Specialty specialty;
    private PersonInfo personInfo;
    private Integer sum;
}
