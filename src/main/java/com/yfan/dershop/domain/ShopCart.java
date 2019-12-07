package com.yfan.dershop.domain;

/**
 * @Author YFAN
 * @Description 购物车表实体类
 * @Date 23:14 2019/12/7/007
 * @Param
 * @return
 **/
public class ShopCart {
    private Integer shopcartid;//shopcartid 购物车表id
    private User user;//userid 用户表id
    private Items items;//itemid 商品信息表id
    private Integer num;//num 数量

    @Override
    public String toString() {
        return "ShopCart{" +
                "shopcartid=" + shopcartid +
                ", user=" + user +
                ", items=" + items +
                ", num=" + num +
                '}';
    }

    public Integer getShopcartid() {
        return shopcartid;
    }

    public void setShopcartid(Integer shopcartid) {
        this.shopcartid = shopcartid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public ShopCart(Integer shopcartid, User user, Items items, Integer num) {
        this.shopcartid = shopcartid;
        this.user = user;
        this.items = items;
        this.num = num;
    }

    public ShopCart() {
    }
}
