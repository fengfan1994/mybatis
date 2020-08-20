package com.fengfan.mybatis.dao;

import com.fengfan.mybatis.pojo.Ordertail;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrdertailMapper {
    int insert(Ordertail record);

    List<Ordertail> selectAll();
}