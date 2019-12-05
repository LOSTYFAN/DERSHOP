package com.yfan.dershop.service;

import com.yfan.dershop.domain.User;
import com.yfan.dershop.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author YFAN
 * @Description
 * @Date 20:55 2019/12/4
 * @Param
 * @return
 **/
@Service
public class LoginService {
    @Autowired
    private UserMapper userMapper;
    /**
     * @Author YFAN
     * @Description 登录业务
     * @Date 21:34 2019/12/5
     * @Param [username, password]
     * @return com.yfan.dershop.domain.User
     **/
    public User login(String username,String password){
        return userMapper.queryUserByUsernameAndPassword(username, password);
    }

}
