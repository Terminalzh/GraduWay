package com.gr.geias.service.impl;

import com.gr.geias.entity.EmploymentWay;
import com.gr.geias.mapper.EmploymentWayMapper;
import com.gr.geias.service.EmploymentWayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Service
public class EmploymentWayServiceImpl implements EmploymentWayService {
    @Autowired
    EmploymentWayMapper employmentWayMapper;

    @Override
    public List<EmploymentWay> getEmploymentWay() {
        return employmentWayMapper.queryEmploymentWay();
    }
}
