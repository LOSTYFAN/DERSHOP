package com.yfan.dershop.domain;

/**
 * @Author YFAN
 * @Description 商品信息表实体类
 * @Date 23:05 2019/12/7/007
 * @Param
 * @return
 **/
public class Items {
    private Integer itemsid;//itemsid 商品id
    private String itemsname;//itemsname 商品名称
    private String itemsdes;//itemsdes 商品描述
    private String itemsbrand;//itemsBrand 商品品牌
    private String itemstype;//itemstype 商品类型
    private Double price;//price 价格
    private String pic;//pic 图片地址

    public Items() {
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemsid=" + itemsid +
                ", itemsname='" + itemsname + '\'' +
                ", itemsdes='" + itemsdes + '\'' +
                ", itemsbrand='" + itemsbrand + '\'' +
                ", itemstype='" + itemstype + '\'' +
                ", price=" + price +
                ", pic='" + pic + '\'' +
                '}';
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

    public Items(Integer itemsid, String itemsname, String itemsdes, String itemsbrand, String itemstype, Double price, String pic) {
        this.itemsid = itemsid;
        this.itemsname = itemsname;
        this.itemsdes = itemsdes;
        this.itemsbrand = itemsbrand;
        this.itemstype = itemstype;
        this.price = price;
        this.pic = pic;
    }
}
