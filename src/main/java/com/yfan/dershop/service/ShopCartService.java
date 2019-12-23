package com.yfan.dershop.service;

import com.yfan.dershop.mapper.ShopCartMapper;
import com.yfan.dershop.mapper.vo.ShopCartAndItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author YFAN
 * @Description 处理购物车业务
 * @Date 21:32 2019/12/23/023
 * @Param
 * @return
 **/
@Service
public class ShopCartService {

    @Autowired
    private ShopCartMapper shopCartMapper;

    /**
     * @Author YFAN
     * @Description 处理显示购物车商品信息业务
     * @Date 21:52 2019/12/23/023
     * @Param [userid]
     * @return java.util.List<com.yfan.dershop.mapper.vo.ShopCartAndItems>
     **/
    public List<ShopCartAndItems> shopCarList(Integer userid){
        return shopCartMapper.queryAllByUserid(userid);
    }

}
