package com.yfan.dershop.domain;

import java.util.Date;

/**
 * @Author YFAN
 * @Description 订单表实体类
 * @Date 23:09 2019/12/7/007
 * @Param
 * @return
 **/
public class Order {
    private String orderid;//orderid 订单号 varchar
    private User user;//userid 用户id   int
    private Date createtime;//createtime 下单时间  datetime
    private Integer paystatus;//paystatus 付款状态 int 2已付款 1未付款
    private Double totalprice;//Totalprice 总价 double
    private String content;//content 备注 varchar

    @Override
    public String toString() {
        return "Order{" +
                "orderid='" + orderid + '\'' +
                ", user=" + user +
                ", createtime=" + createtime +
                ", paystatus=" + paystatus +
                ", totalprice=" + totalprice +
                ", content='" + content + '\'' +
                '}';
    }
    
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }

    public Double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Double totalprice) {
        this.totalprice = totalprice;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Order(String orderid, User user, Date createtime, Integer paystatus, Double totalprice, String content) {
        this.orderid = orderid;
        this.user = user;
        this.createtime = createtime;
        this.paystatus = paystatus;
        this.totalprice = totalprice;
        this.content = content;
    }

    public Order() {
    }
}
