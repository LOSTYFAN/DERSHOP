package com.yfan.dershop.mapper;

import com.yfan.dershop.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author YFAN
 * @Description 用户Mapper
 * @Date 20:42 2019/12/5
 * @Param
 * @return
 **/
@Mapper
public interface UserMapper {
    /**
     * @Author YFAN
     * @Description 登录（根据用户名和密码查询用户表）
     * @Date 21:30 2019/12/5
     * @Param [username, password]
     * @return com.yfan.dershop.domain.User
     **/
    public User queryUserByUsernameAndPassword(String username,String password);


}
