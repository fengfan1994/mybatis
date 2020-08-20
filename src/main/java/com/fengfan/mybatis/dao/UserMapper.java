package com.fengfan.mybatis.dao;

import com.fengfan.mybatis.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper {
    int insert(User record);

    List<User> selectAll();

    //根据id查询用户
    public User findUserById(int id);

    //更新用户信息
    public int updateUserById(int id);

    //保存用户
    public int save(User user);

    //根据性别查询用户数
    public int count(String sex);

    //模糊查询
    public int countLike(String str);

}