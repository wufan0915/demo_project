package com.su.yoga.controller;

import com.su.yoga.bean.Result;
import com.su.yoga.bean.User;
import com.su.yoga.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserController {
    @Resource
    UserService userService;

    //demo
    @RequestMapping(value = "/demo")
    public String index(){
        return "***hello springBoot***";
    }

    //用户注册模块
    @PostMapping(value = "/regist")
    public Result regist(User user){
        if(user==null){
            System.out.println("user is null");
            Result res = new Result();
            res.setMsg("user is null");
            return res;
        }
        return userService.regist(user);
    }

    //用户登录模块
    @PostMapping(value = "/login")
    public Result login(User user){
        return userService.login(user);
    }
}
