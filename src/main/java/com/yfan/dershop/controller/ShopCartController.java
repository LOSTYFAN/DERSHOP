package com.yfan.dershop.controller;

import com.yfan.dershop.domain.User;
import com.yfan.dershop.mapper.vo.ShopCartAndItems;
import com.yfan.dershop.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author YFAN
 * @Description 处理购物车请求
 * @Date 21:31 2019/12/23/023
 * @Param
 * @return
 **/
@Controller
public class ShopCartController {
    @Autowired
    private ShopCartService shopCartService;

    @RequestMapping(value = "shopCartList")
    public ModelAndView shopCartList(HttpSession session){
        System.out.println("---shopCartList---");
        ModelAndView mav=new ModelAndView();

        List<ShopCartAndItems> shopCartAndItemsList;

        //获取session中的用户信息
        User user= (User) session.getAttribute("user");
        //判断user是否为空
        if(user!=null){
            //用户已登录，获取用户购物车信息
            shopCartAndItemsList=shopCartService.shopCarList(user.getUserid());
        }else{
            //用户没有登录，返回一个空的购物车
            shopCartAndItemsList=new ArrayList<>();
        }
        System.out.println("shoplist:"+shopCartAndItemsList.toString());
        mav.addObject("shoplist",shopCartAndItemsList);
        mav.setViewName("shop_cart");
        return mav;
    }

}
