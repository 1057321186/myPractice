package com.project.util;

import java.util.List;

/**
 * 分页工具
 */
public class PageUtil {

    /**
     * List内存分页
     * @param list
     * @param pageNumber
     * @param pageSize
     * @return
     */
    public static <T> List<T> getPageList(List<T> list,Integer pageNumber,Integer pageSize) {
        int size = list.size();
        int fromIndex = pageSize * (pageNumber - 1);
        int toIndex = fromIndex + pageSize;
        if (toIndex >= size) {
            toIndex = size;
        }

        List<T> subList = list.subList(fromIndex, toIndex);
        return subList;
    }
}
