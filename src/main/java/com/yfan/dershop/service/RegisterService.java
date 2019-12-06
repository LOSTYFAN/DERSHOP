package com.yfan.dershop.service;

import com.yfan.dershop.domain.User;
import com.yfan.dershop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @Author YFAN
 * @Description 注册模块业务
 * @Date 20:20 2019/12/6/006
 * @Param
 * @return
 **/
@Service
public class RegisterService {
    @Autowired
    private UserMapper userMapper;
    /**
     * @Author YFAN
     * @Description 检查用户名是否已存在
     * @Date 21:09 2019/12/6/006
     * @Param [username]
     * @return com.yfan.dershop.domain.User
     **/
    public User checkUsername(String username){
        return userMapper.selectUserByUsername(username);
    }
    /**
     * @Author YFAN
     * @Description 用户注册
     * @Date 21:10 2019/12/6/006
     * @Param [user]
     * @return int
     **/
    public int register(User user){
        return userMapper.insertUser(user);
    }
}
