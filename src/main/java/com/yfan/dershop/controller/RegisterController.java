package com.yfan.dershop.controller;

import com.yfan.dershop.domain.User;
import com.yfan.dershop.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @Author YFAN
 * @Description 处理注册模块请求
 * @Date 20:18 2019/12/6/006
 * @Param
 * @return
 **/
@Controller
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    /**
     * @Author YFAN
     * @Description 去往注册页面
     * @Date 20:21 2019/12/6/006
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("toRegister")
    public String toRegister(){
        return "reg";
    }
    /**
     * @Author YFAN
     * @Description 检查用户名是否被注册
     * @Date 20:41 2019/12/6/006
     * @Param [username]
     * @return java.lang.String
     **/
    @RequestMapping("checkUsername")
    @ResponseBody
    public String checkUsername(String username){
        System.out.println("---checkUsername---");
        User user=registerService.checkUsername(username);
        if(user!=null){
            return "该用户已被注册！";
        }else{
            return "";
        }
    }
    /**
     * @Author YFAN
     * @Description 用户注册请求
     * @Date 21:05 2019/12/6/006
     * @Param [user]
     * @return java.lang.String
     **/
    @RequestMapping("register")
    @ResponseBody
    public String register(HttpSession session,User user, String code){
        System.out.println("---register---");
        String confirmCode= (String) session.getAttribute("code");
        if(code!=null && code.equalsIgnoreCase(confirmCode)){
            if(user!=null){
                System.out.println(user);
                int result=registerService.register(user);
                if(result>0){
                    return "";
                }else{
                    return "注册失败！";
                }
            }else{
                return "注册失败！";
            }
        }else{
            return "验证码错误！";
        }
    }
}
