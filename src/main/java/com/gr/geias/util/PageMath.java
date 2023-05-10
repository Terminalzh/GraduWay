package com.gr.geias.util;

/**
 * @author Terminal
 * @version 1.0
 * @since 2023-05-06
 */
public class PageMath {
    /**
     * 将前端的pageNum 页码 转换为 Dao层理解的 行数
     * @param pageNum 页码
     * @param pageSize 每一页的大小
     * @return 行数
     */
    public static int pageNumtoRowIndex(int pageNum,int pageSize){
        return pageNum>0?(pageNum-1)*pageSize:0;
    }

}
