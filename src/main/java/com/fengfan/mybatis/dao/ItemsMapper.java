package com.fengfan.mybatis.dao;

import com.fengfan.mybatis.pojo.Items;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ItemsMapper {
    public int insert(Items record);

    List<Items> selectAll();

    public Items findById(Integer id);

    public int update(Items items);

    public int deleteById(Integer id);
}