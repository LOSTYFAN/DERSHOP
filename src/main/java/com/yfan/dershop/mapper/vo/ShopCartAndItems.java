package com.yfan.dershop.mapper.vo;

/**
 * @Author YFAN
 * @Description 购物车和商品信息VO
 * @Date 21:48 2019/12/23/023
 **/
public class ShopCartAndItems {
    private Integer shopcartid;
    private Integer num;
    private Integer itemsid;
    private String itemsname;
    private String itemsdes;
    private String itemsbrand;
    private String itemstype;
    private Double price;
    private String pic;

    public ShopCartAndItems(Integer shopcartid, Integer num, Integer itemsid, String itemsname, String itemsdes, String itemsbrand, String itemstype, Double price, String pic) {
        this.shopcartid = shopcartid;
        this.num = num;
        this.itemsid = itemsid;
        this.itemsname = itemsname;
        this.itemsdes = itemsdes;
        this.itemsbrand = itemsbrand;
        this.itemstype = itemstype;
        this.price = price;
        this.pic = pic;
    }

    public ShopCartAndItems() {
    }

    @Override
    public String toString() {
        return "ShopCartAndItems{" +
                "shopcartid=" + shopcartid +
                ", num=" + num +
                ", itemsid=" + itemsid +
                ", itemsname='" + itemsname + '\'' +
                ", itemsdes='" + itemsdes + '\'' +
                ", itemsbrand='" + itemsbrand + '\'' +
                ", itemstype='" + itemstype + '\'' +
                ", price=" + price +
                ", pic='" + pic + '\'' +
                '}';
    }

    public Integer getShopcartid() {
        return shopcartid;
    }

    public void setShopcartid(Integer shopcartid) {
        this.shopcartid = shopcartid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getItemsid() {
        return itemsid;
    }

    public void setItemsid(Integer itemsid) {
        this.itemsid = itemsid;
    }

    public String getItemsname() {
        return itemsname;
    }

    public void setItemsname(String itemsname) {
        this.itemsname = itemsname;
    }

    public String getItemsdes() {
        return itemsdes;
    }

    public void setItemsdes(String itemsdes) {
        this.itemsdes = itemsdes;
    }

    public String getItemsbrand() {
        return itemsbrand;
    }

    public void setItemsbrand(String itemsbrand) {
        this.itemsbrand = itemsbrand;
    }

    public String getItemstype() {
        return itemstype;
    }

    public void setItemstype(String itemstype) {
        this.itemstype = itemstype;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }
}
