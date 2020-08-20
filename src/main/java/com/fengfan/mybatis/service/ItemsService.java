package com.fengfan.mybatis.service;

import com.fengfan.mybatis.dao.ItemsMapper;
import com.fengfan.mybatis.pojo.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsService {
    @Autowired
    private ItemsMapper itemsMapper;

    public Items getById(Integer id){
        return itemsMapper.findById(id);
    }

    public int deleteById(Integer id){
        return itemsMapper.deleteById(id);
    }

    public int addItems(Items items){
        return itemsMapper.insert(items);
    }

    public List<Items> findAll(){
        return itemsMapper.selectAll();
    }

    public int updateItems(Items items){
        return itemsMapper.update(items);
    }
}
