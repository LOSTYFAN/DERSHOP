package com.yfan.dershop.controller;

import com.yfan.dershop.domain.Items;
import com.yfan.dershop.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author YFAN
 * @Description 处理商品相关请求
 * @Date 19:50 2019/12/21/021
 * @Param
 * @return
 **/
@Controller
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    /**
     * @Author YFAN
     * @Description 罗列全部商品信息
     * @Date 21:21 2019/12/21/021
     * @Param [modelAndView]
     * @return org.springframework.web.servlet.ModelAndView
     **/
    @RequestMapping(value = "shopList")
    public ModelAndView shopList(ModelAndView modelAndView){
        System.out.println("---shopList---");
        List<Items> list=itemsService.shopList();
        modelAndView.addObject("shoplist",list);
        modelAndView.setViewName("shop_list");
        return modelAndView;
    }

    /**
     * @Author YFAN
     * @Description 商品详细信息
     * @Date 21:20 2019/12/21/021
     * @Param [modelAndView, itemsid]
     * @return void
     **/
    @RequestMapping(value = "itemsDetail")
    public ModelAndView itemsDetail(ModelAndView modelAndView,Integer itemsid){
        System.out.println("---itemsDetail---");
        Items items=itemsService.queryItemsById(itemsid);
        modelAndView.addObject("items",items);
        modelAndView.setViewName("pro_details");
        return modelAndView;
    }

}
