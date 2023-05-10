package com.gr.geias.service;

import com.gr.geias.entity.Area;

import java.util.List;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public interface AreaService  {
    /**
     * 查询地区
     * @param area
     * @return
     */
    List<Area> getArea(Area area);
}
