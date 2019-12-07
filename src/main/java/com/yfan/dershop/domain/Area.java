package com.yfan.dershop.domain;

/**
 * @Author YFAN
 * @Description 区县表实体类
 * @Date 23:04 2019/12/7/007
 * @Param
 * @return
 **/
public class Area {
    private Integer areaid;
    private String area;
    private City father;

    public Area(Integer areaid) {
        this.areaid = areaid;
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaid=" + areaid +
                ", area='" + area + '\'' +
                ", father=" + father +
                '}';
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public City getFather() {
        return father;
    }

    public void setFather(City father) {
        this.father = father;
    }

    public Area(Integer areaid, String area, City father) {
        this.areaid = areaid;
        this.area = area;
        this.father = father;
    }

    public Area() {
    }
}
