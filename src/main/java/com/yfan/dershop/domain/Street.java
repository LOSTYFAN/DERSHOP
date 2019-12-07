package com.yfan.dershop.domain;

/**
 * @Author YFAN
 * @Description 街道表实体类
 * @Date 23:04 2019/12/7/007
 * @Param
 * @return
 **/
public class Street {
    private Integer streetid;
    private String street;
    private Area father;

    public Integer getStreetid() {
        return streetid;
    }

    public void setStreetid(Integer streetid) {
        this.streetid = streetid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Area getFather() {
        return father;
    }

    public void setFather(Area father) {
        this.father = father;
    }

    @Override
    public String toString() {
        return "Street{" +
                "streetid=" + streetid +
                ", street='" + street + '\'' +
                ", father=" + father +
                '}';
    }

    public Street(Integer streetid) {
        this.streetid = streetid;
    }

    public Street(Integer streetid, String street, Area father) {
        this.streetid = streetid;
        this.street = street;
        this.father = father;
    }

    public Street() {
    }
}
