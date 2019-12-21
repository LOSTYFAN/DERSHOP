package com.yfan.dershop.service;

import com.yfan.dershop.domain.Items;
import com.yfan.dershop.mapper.ItemsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author YFAN
 * @Description 处理商品相关事务
 * @Date 19:57 2019/12/21/021
 * @Param
 * @return
 **/
@Service
public class ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    /**
     * @Author YFAN
     * @Description 获取全部商品信息
     * @Date 20:05 2019/12/21/021
     * @Param []
     * @return java.util.List<com.yfan.dershop.domain.Items>
     **/
    public List<Items> shopList(){
        return itemsMapper.queryAll();
    }

    /**
     * @Author YFAN
     * @Description 显示商品详细信息
     * @Date 21:20 2019/12/21/021
     * @Param [id]
     * @return com.yfan.dershop.domain.Items
     **/
    public Items queryItemsById(Integer id) {
        return itemsMapper.queryItemsById(id);
    }
}
