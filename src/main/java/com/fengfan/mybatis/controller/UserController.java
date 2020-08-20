package com.fengfan.mybatis.controller;

import com.fengfan.mybatis.pojo.User;
import com.fengfan.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;


@Controller
@RequestMapping(value="/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping(value="/getUser")
    @ResponseBody
    public User getUser(Integer id) {
        User user=userService.getUser(id);
        return user;
    }


    @RequestMapping(value = "/count")
    public void countEmployeeNum(){
        int num=userService.getEmployeeNum();
        System.out.println("有男性员工"+num+"位");
    }

    @RequestMapping(value="/getAll")
    @ResponseBody
    public List<User> getAll(){
        List<User> list=userService.getAll();
        return list;
    }

    @RequestMapping(value="/insert")
    @ResponseBody
    public String insertUser(){
        int success=userService.insertUser();
        if(success>0){
            System.out.println("插入数据成功");
        }
        String res="插入数据成功";
        return res;
    }

    @RequestMapping(value="/countLike")
    @ResponseBody
    public String countLike(String str){
        System.out.println(str);
        str=str.trim();
        int num=userService.countLike(str);
        System.out.println("名字中含有"+str+"的员工"+num+"位");
        String result="名字中含有"+str+"的员工"+num+"位";
        return result;
    }
}
