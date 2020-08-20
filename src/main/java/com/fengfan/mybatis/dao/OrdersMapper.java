package com.fengfan.mybatis.dao;

import com.fengfan.mybatis.pojo.Orders;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdersMapper {
    int insert(Orders record);

    List<Orders> selectAll();
}