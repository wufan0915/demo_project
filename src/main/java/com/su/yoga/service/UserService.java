package com.su.yoga.service;

import com.su.yoga.bean.Result;
import com.su.yoga.bean.User;
import com.su.yoga.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public interface UserService {
    /**
     * 注册
     * @param  user
     * @return Result
     */
    public Result regist(User user);

    /**
     *登录
     * @param user
     * @Return Result
     */
    public Result login(User user);

}
