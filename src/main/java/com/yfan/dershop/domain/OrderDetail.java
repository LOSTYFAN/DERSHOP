package com.yfan.dershop.domain;

/**
 * @Author YFAN
 * @Description 订单明细表实体类
 * @Date 23:12 2019/12/7/007
 * @Param
 * @return
 **/
public class OrderDetail {
    private Integer orderdetailid;//orderdetailid 订单明细表id
    private Order order;//orderid 订单表id varchar
    private Items items;//itemsid 商品信息表id
    private Integer num;//num 数量

    public OrderDetail() {
    }

    public OrderDetail(Integer orderdetailid, Order order, Items items, Integer num) {
        this.orderdetailid = orderdetailid;
        this.order = order;
        this.items = items;
        this.num = num;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderdetailid=" + orderdetailid +
                ", order=" + order +
                ", items=" + items +
                ", num=" + num +
                '}';
    }

    public Integer getOrderdetailid() {
        return orderdetailid;
    }

    public void setOrderdetailid(Integer orderdetailid) {
        this.orderdetailid = orderdetailid;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
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
}
