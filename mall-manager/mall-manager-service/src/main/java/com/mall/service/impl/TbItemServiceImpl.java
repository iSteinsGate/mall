package com.mall.service.impl;

import com.mall.mapper.TbItemMapper;
import com.mall.pojo.TbItem;
import com.mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TbItemServiceImpl implements TbItemService {
    @Autowired
    TbItemMapper tbItemMapper;

    @Override
    public TbItem get(Long id) {
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
        return tbItem;
    }
}
