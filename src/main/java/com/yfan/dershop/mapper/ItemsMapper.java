package com.yfan.dershop.mapper;

import com.yfan.dershop.domain.Items;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author YFAN
 * @Description 商品信息表DAO
 * @Date 19:57 2019/12/21/021
 * @Param
 * @return
 **/
@Mapper
public interface ItemsMapper {
    /**
     * @Author YFAN
     * @Description 查看全部商品信息
     * @Date 19:59 2019/12/21/021
     * @Param []
     * @return java.util.List<com.yfan.dershop.domain.Items>
     **/
    public List<Items> queryAll();

    /**
     * @Author YFAN
     * @Description 根据id查询商品信息
     * @Date 21:23 2019/12/21/021
     * @Param [id]
     * @return com.yfan.dershop.domain.Items
     **/
    public Items queryItemsById(Integer id);
}
