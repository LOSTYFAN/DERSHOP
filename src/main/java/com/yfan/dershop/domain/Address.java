package com.yfan.dershop.domain;
/**
 * @Author YFAN
 * @Description 地址表实体类
 * @Date 23:16 2019/12/7/007
 * @Param
 * @return
 **/
public class Address {
    private Integer addid;//addid 地址表id  int
    private User user;//userid 用户表id  int
    private Province province;//provinceid 省份表id   int
    private City city;//cityid 城市表id   int
    private Area area;//areaid 区县表id   int
    private Street street;//streetid 街道表id  int
    private String finaladdress;//finaladdress   varchar

    public Integer getAddid() {
        return addid;
    }

    public void setAddid(Integer addid) {
        this.addid = addid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Street getStreet() {
        return street;
    }

    public void setStreet(Street street) {
        this.street = street;
    }

    public String getFinaladdress() {
        return finaladdress;
    }

    public void setFinaladdress(String finaladdress) {
        this.finaladdress = finaladdress;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addid=" + addid +
                ", user=" + user +
                ", province=" + province +
                ", city=" + city +
                ", area=" + area +
                ", street=" + street +
                ", finaladdress='" + finaladdress + '\'' +
                '}';
    }

    public Address(Integer addid, User user, Province province, City city, Area area, Street street, String finaladdress) {
        this.addid = addid;
        this.user = user;
        this.province = province;
        this.city = city;
        this.area = area;
        this.street = street;
        this.finaladdress = finaladdress;
    }

    public Address() {
    }
}

