package com.yfan.dershop.domain;

/**
 * @Author YFAN
 * @Description 城市表实体类
 * @Date 23:04 2019/12/7/007
 * @Param
 * @return
 **/
public class City {
    private Integer cityid;
    private String city;
    private Province father;

    public City(Integer cityid, String city, Province father) {
        this.cityid = cityid;
        this.city = city;
        this.father = father;
    }

    public City() {
    }

    public City(Integer cityid, String city) {
        this.cityid = cityid;
        this.city = city;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityid=" + cityid +
                ", city='" + city + '\'' +
                ", father=" + father +
                '}';
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Province getFather() {
        return father;
    }

    public void setFather(Province father) {
        this.father = father;
    }
}
