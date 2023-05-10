package com.gr.geias.service.impl;

import com.gr.geias.entity.UnitKind;
import com.gr.geias.mapper.UnitKindMapper;
import com.gr.geias.service.UnitKindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
@Service
public class UnitKindServiceImpl implements UnitKindService {
    @Autowired
    UnitKindMapper unitKindMapper;

    @Override
    public List<UnitKind> getUnitKind() {
        return unitKindMapper.queryUnitKind();
    }
}
