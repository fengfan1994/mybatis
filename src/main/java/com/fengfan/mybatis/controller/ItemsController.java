package com.fengfan.mybatis.controller;

import com.fengfan.mybatis.pojo.Items;
import com.fengfan.mybatis.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一直 如2015-9-9 就应该为yyyy-MM-dd
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }

    @Autowired
    ItemsService itemsService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Items> itemsList=itemsService.findAll();
        model.addAttribute("itemsList",itemsList);
        return "list";
    }

    @RequestMapping("/edit")
    public String edit(Integer id,Model model){
        Items items=itemsService.getById(id);
        model.addAttribute("items",items);
        return "edit";

    }

    @RequestMapping("/update")
    public String update(Items items){
        itemsService.updateItems(items);
        return "redirect:list";

    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        itemsService.deleteById(id);
        return "redirect:list";
    }


    @RequestMapping("/insert")
    public String insert(Items items){
        itemsService.addItems(items);
        return "redirect:list";
    }

    @RequestMapping("/add")
    public String add(){
        System.out.println("this is add");
        return "add";
    }
}
