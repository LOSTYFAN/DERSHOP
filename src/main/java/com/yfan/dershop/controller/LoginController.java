package com.yfan.dershop.controller;

import com.yfan.dershop.domain.User;
import com.yfan.dershop.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.sound.midi.Soundbank;
import java.util.List;
/**
 * @Author YFAN
 * @Description 处理登录请求
 * @Date 20:11 2019/12/5
 * @Param
 * @return
 **/
@Controller
public class LoginController {
    //登录service
    @Autowired
    private LoginService loginService;

    /**
     * @Author YFAN
     * @Description 去往登录页面
     * @Date 19:51 2019/12/5
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("toLogin")
    public String test(){
        return "login";
    }
    /**
     * @Author YFAN
     * @Description 登录请求
     * @Date 20:30 2019/12/5
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("login")
    @ResponseBody
    public String login(HttpSession session,String username,String password,String code){
        System.out.println("---login---");
        String confirmCode= (String) session.getAttribute("code");
        if(code!=null && code.equalsIgnoreCase(confirmCode)){
            System.out.println("验证码正确");
            User user=loginService.login(username, password);
            if(user==null){
                return "用户名和密码错误！";
            }else{
                System.out.println("user="+user.toString());
                session.setAttribute("user",user);
                return "";
            }
        }else{
            System.out.println("验证码错误");
            return "验证码错误！";
        }
    }
    /**
     * @Author YFAN
     * @Description 去往首页请求
     * @Date 21:25 2019/12/5
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    /**
     * @Author YFAN
     * @Description 验证码错误信息提示
     * @Date 20:51 2019/12/5
     * @Param []
     * @return java.lang.String
     **/
    @ResponseBody
    @RequestMapping("codeError")
    public String codeError(){
        System.out.println("---codeError---");
        return "<script>alert('验证码错误！');</script>";
    }



}
