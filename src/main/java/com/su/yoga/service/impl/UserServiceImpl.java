package com.su.yoga.service.impl;

import com.su.yoga.bean.Result;
import com.su.yoga.bean.User;
import com.su.yoga.dao.UserMapper;
import com.su.yoga.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public Result regist(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);


        //查询用户是否已经注册
        if(user==null){
           result.setMsg("请输入完整的用户注册信息");
        }

        String nickname = user.getNickname();
        User resultUser = userMapper.findUserByName(nickname);
        if(resultUser!=null){//用户已注册,提示直接登录
            result.setMsg("该用户已经注册，请登录");
            return result;
        }

        int resNum = userMapper.addUser(user);
        if ("1".equals(resNum) || resNum==1){
            result.setSuccess(true);
            result.setMsg("注册成功");
            result.setDetail(user);
            return result;
        }else{
            System.out.println("注册失败，请重试");
            result.setMsg("注册失败，请重试");
        }

        return result;
    }

    @Override
    public Result login(User user) {
        Result result = new Result();
        result.setSuccess(false);
        result.setDetail(null);

        //输入信息不完整，重新登录
        if(user.getNickname()==null || user.getPassword()==null){
            System.out.println("用户信息输入不完整，请重新登录");
            result.setMsg("用户信息输入不完整，登录失败");
        }

        User resultUser = userMapper.login(user.getNickname(), user.getPassword());

        //用户未注册提示注册
        if(resultUser==null){
            System.out.println("您输入的账号不正确或与密码不匹配，请重新输入");
            result.setMsg("您输入的账号不正确或与密码不匹配，请重新输入");
            return result;
        }
        //检验通过
        result.setMsg("登录成功");
        result.setSuccess(true);
        result.setDetail(resultUser);

        return result;
    }
}
