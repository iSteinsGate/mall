package com.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mall.mapper.TbItemMapper;
import com.mall.pojo.Page;
import com.mall.pojo.TbItem;
import com.mall.pojo.TbItemExample;
import com.mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ItemServiceImpl implements ItemService {
    @Autowired
    TbItemMapper tbItemMapper;

    @Override
    public TbItem get(Long id) {
        TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
        return tbItem;
    }

    @Override
    public  List<TbItem> findPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        TbItemExample tbItemExample = new TbItemExample();
        List<TbItem> tbItems = (tbItemMapper.selectByExample(tbItemExample));
        Page page = new Page();
        page.setData(tbItems);
        PageInfo<TbItem> pageInfo = new PageInfo<>(tbItems);
        page.setPageNum(pageNum);
        page.setPageSize(pageSize);
        page.setTotal(pageInfo.getTotal());
        return tbItems;
    }
}
