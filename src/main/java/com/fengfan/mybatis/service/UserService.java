package com.fengfan.mybatis.service;


import com.fengfan.mybatis.dao.UserMapper;
import com.fengfan.mybatis.pojo.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
   @Autowired
    UserMapper userMapper;


    public User getUser(Integer id){
        User user=userMapper.findUserById(1);
        return user;
    }

    public int getEmployeeNum(){
        return userMapper.count("男");
    }

    public int countLike(String str){
        return userMapper.countLike(str);
    }

    public List<User> getAll(){
        return userMapper.selectAll();
    }

    public int insertUser(){
        User user=new User("冯帆",new Date(),"男","中国");
        return userMapper.insert(user);
    }
}
