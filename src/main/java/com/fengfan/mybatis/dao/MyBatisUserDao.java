package com.fengfan.mybatis.dao;

import com.fengfan.mybatis.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBatisUserDao {
    public User getUser(Long id);
}
