package com.yfan.dershop.domain;

/**
 * @Author YFAN
 * @Description 省份表实体类
 * @Date 23:03 2019/12/7/007
 * @Param
 * @return
 **/
public class Province {
    private Integer provinceid;
    private String province;

    public Province(Integer provinceid, String province) {
        this.provinceid = provinceid;
        this.province = province;
    }

    public Province() {
    }

    public Integer getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Integer provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Province{" +
                "provinceid=" + provinceid +
                ", province='" + province + '\'' +
                '}';
    }
}
