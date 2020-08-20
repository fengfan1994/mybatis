package com.fengfan.mybatis.dao;

import com.fengfan.mybatis.pojo.Orderdetail;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderdetailMapper {
    int insert(Orderdetail record);

    List<Orderdetail> selectAll();
}