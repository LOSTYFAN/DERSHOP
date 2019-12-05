package com.yfan.dershop.domain;

import java.util.Date;

/**
 * @Author YFAN
 * @Description 用户表
 * @Date 20:42 2019/12/5
 * @Param
 * @return
 **/
public class User {

    private Integer userid;

    private String username;

    private String password;

    private String realname;

    private String email;

    private String phone;

    private Byte sex;

    private Date birthday;

    public User() {
    }

    public User(Integer userid, String username, String password, String realname, String email, String phone, Byte sex, Date birthday) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", realname='" + realname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                '}';
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRealname() {
        return realname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Byte getSex() {
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }
}
