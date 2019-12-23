package com.yfan.dershop.mapper;

import com.yfan.dershop.mapper.vo.ShopCartAndItems;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 * @Author YFAN
 * @Description  购物车表DAO
 * @Date 21:33 2019/12/23/023
 * @Param
 * @return
 **/
@Mapper
public interface ShopCartMapper {
    /**
     * @Author YFAN
     * @Description 根据用户id查询用户购物车商品信息
     * @Date 21:36 2019/12/23/023
     * @Param [id]
     * @return java.util.List<com.yfan.dershop.mapper.vo.ShopCartAndItems>
     **/
    public List<ShopCartAndItems> queryAllByUserid(Integer userid);

}
