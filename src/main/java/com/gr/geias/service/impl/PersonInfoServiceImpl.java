package com.gr.geias.service.impl;

import com.gr.geias.entity.PersonInfo;
import com.gr.geias.mapper.EmploymentInformationMapper;
import com.gr.geias.mapper.PersonInfoMapper;
import com.gr.geias.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Service
public class PersonInfoServiceImpl implements PersonInfoService {
    @Autowired
    PersonInfoMapper personInfoMapper;

    @Override
    public PersonInfo login(String username, String password) {
        return personInfoMapper.queryPerson(username, password);
    }

    @Override
    public PersonInfo getPersonById(Integer personId) {
        return personInfoMapper.queryPersonById(personId);
    }

    @Override
    public List<PersonInfo> getCollegePerson() {
        return personInfoMapper.queryCollegePerson();
    }

    @Override
    public List<PersonInfo> getPersonByCollegeId(Integer collegeId) {
        return personInfoMapper.queryPersonByCollegeId(collegeId);
    }

    @Override
    public Boolean insertPerson(PersonInfo personInfo) {
        Integer integer = personInfoMapper.insertPerson(personInfo);
        return integer > 0;
    }

    @Override
    public Boolean updatePerson(PersonInfo personInfo) {
        try {
            Integer integer = personInfoMapper.updatePersonInfoById(personInfo);
            return integer > 0;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    @Override
    public Boolean delPerson(Integer personId) {
        Integer integer = personInfoMapper.deletePersonById(personId);
        return integer > 0;
    }

    @Override
    public List<PersonInfo> getPerson1() {
        return personInfoMapper.queryPerson1();
    }

}
