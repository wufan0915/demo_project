package com.su.yoga.dao;

import com.su.yoga.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    //用户注册
    public int addUser(User user);
    //用户登录
    public User findUserByName(User user);
}
