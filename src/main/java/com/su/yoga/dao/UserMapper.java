package com.su.yoga.dao;

import com.su.yoga.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.xml.ws.Service;

@Repository
@Mapper
public interface UserMapper {

    /*
    查询用户 find 根据nickname查找用户
     */
    @Select("select * from user where nickname = #{nickname}")
    User findUserByName(String nickname);

    /*
    登录 login 匹配nickname和password
     */
    @Select("select * from user where nickname = #{nickname} and password = #{password}")
    User login(@Param("nickname")String nickname,@Param("password")String password);

    /*
    注册 新增用户信息 addUser()
     */
    @Insert("insert into user (nickname,avatar,password) values (#{nickname},#{avatar},#{password});")
    int addUser(User user);


}
