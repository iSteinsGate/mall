package com.mall.service;

import com.mall.pojo.TbItem;

import java.util.List;

/**
 * @author tsinghui
 * @data 2019-11-25
 */

public interface ItemService {
    TbItem get(Long id);

    List<TbItem> findPage(int  pageNum, int pageSize);
}