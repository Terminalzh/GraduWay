package com.gr.geias.mapper;

import com.gr.geias.GeiasApplicationTests;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author maitentai
 * @version 1.0
 * @date 2020-03-07 21:17
 */
class ClassGradeMapperTest extends GeiasApplicationTests {
    @Autowired
    ClassGradeMapper classGradeMapper;
    @Test
    void queryspecialtyId() {
        Integer integer = classGradeMapper.querySpecialtyById(8);
        System.out.println(integer);
    }
}