package com.mall.controller;

import com.mall.pojo.TbItem;
import com.mall.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TbItemController {

    @Autowired
    TbItemService tbItemService;

    @RequestMapping("/item/{id}")
    @ResponseBody
    public TbItem get(@PathVariable("id") Long id){
        return tbItemService.get(id);
    }
}
