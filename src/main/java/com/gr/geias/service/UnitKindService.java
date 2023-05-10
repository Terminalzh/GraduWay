package com.gr.geias.service;

import com.gr.geias.entity.UnitKind;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public interface UnitKindService {
    /**
     * 获取工作分类
     * @return
     */
    List<UnitKind> getUnitKind();

}
